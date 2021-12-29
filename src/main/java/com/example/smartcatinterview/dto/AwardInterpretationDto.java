package com.example.smartcatinterview.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class AwardInterpretationDto {

    private UUID id;
    private LocalDate date;
    private Float units;
    private BigDecimal cost;

}
