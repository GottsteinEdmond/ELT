package com.example.smartcatinterview.extract;


import com.example.smartcatinterview.dto.ShiftApiResponse;
import com.example.smartcatinterview.dto.ShiftDto;
import com.example.smartcatinterview.services.ShiftService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShiftExtract {

    @Autowired
    ShiftService shiftService;

    private static final String BASE_URL = "http://localhost:8000";
    private final RestTemplate restTemplate = new RestTemplate();


    public void getShifts() {
        List<ShiftDto> result = new ArrayList<>();

        String next = fillShiftResults("/api/shifts?start=0&limit=7", result);

        while (StringUtils.isNoneEmpty(next)) {
            next = fillShiftResults(next, result);
        }

        shiftService.saveToDb(result);

    }

    public String fillShiftResults(String url, List<ShiftDto> shifts) {
        ResponseEntity<ShiftApiResponse> forEntity = restTemplate.getForEntity(
                BASE_URL + url, ShiftApiResponse.class);

        ShiftApiResponse response = forEntity.getBody();
        shifts.addAll(response.getResults());

        return response.getLinks().getNext();
    }

}