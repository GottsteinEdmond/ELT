package com.example.smartcatinterview.services;

import com.example.smartcatinterview.dto.ShiftDto;
import com.example.smartcatinterview.mapper.ShiftDtoToEntityMapper;
import com.example.smartcatinterview.model.Shift;
import com.example.smartcatinterview.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShiftServiceImpl implements ShiftService {

    @Autowired
    ShiftRepository shiftRepository;

    @Autowired
    ShiftDtoToEntityMapper shiftDtoToEntityMapper;

    @Override
    @Transactional
    public void saveToDb(List<ShiftDto> shiftDtos) {
        List<Shift> shifts = shiftDtoToEntityMapper.map(shiftDtos);
        shiftRepository.saveAllAndFlush(shifts);
    }
}
