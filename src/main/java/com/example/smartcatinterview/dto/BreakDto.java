package com.example.smartcatinterview.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class BreakDto {

    private UUID id;
    private Timestamp start;
    private Timestamp finish;
    private Boolean paid;

}
