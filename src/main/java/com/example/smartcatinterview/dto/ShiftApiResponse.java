package com.example.smartcatinterview.dto;


import lombok.Data;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Data
public class ShiftApiResponse {

    List<ShiftDto> results;
    LinkDto links;

}
