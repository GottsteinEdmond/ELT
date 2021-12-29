package com.example.smartcatinterview.mapper;

import com.example.smartcatinterview.dto.ShiftDto;
import com.example.smartcatinterview.model.Shift;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class ShiftDtoToEntityMapper extends EntityMapper<ShiftDto, Shift> {

    @Override
    protected List<Shift> mapToOutput(List<ShiftDto> input) {
        return input.parallelStream()
                .map(this::buildShifEntity)
                .collect(Collectors.toList());
    }

    private Shift buildShifEntity(ShiftDto shiftDto) {
        return Shift.builder()
                .shifId(UUID.fromString(shiftDto.getId()))
                .shiftDate(LocalDate.parse(shiftDto.getDate()))
                .shiftStart(shiftDto.getStart())
                .shiftFinish(shiftDto.getFinish())
                .build();
    }
}
