package com.example.smartcatinterview.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class AllowanceDto {

    private UUID id;
    private Float value;
    private BigDecimal cost;

}
