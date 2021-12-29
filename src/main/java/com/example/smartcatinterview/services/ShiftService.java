package com.example.smartcatinterview.services;

import com.example.smartcatinterview.dto.ShiftDto;
import com.example.smartcatinterview.model.Shift;

import java.util.List;

public interface ShiftService {

    void saveToDb(List<ShiftDto> shiftDtos);
}
