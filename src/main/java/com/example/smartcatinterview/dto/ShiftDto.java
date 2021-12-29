package com.example.smartcatinterview.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;

@Data
public class ShiftDto {

    private String id;
    private String date;
    private Timestamp start;
    private Timestamp finish;

    private Set<BreakDto> breaks;
    private Set<AllowanceDto> allowances;
    private Set<AwardInterpretationDto> awardInterpretations;

}
