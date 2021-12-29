package com.example.smartcatinterview.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Kpi {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID kpiId;
    @Column(unique = true, nullable = false)
    private String kpiName;
    @Column(unique = true, nullable = false)
    private LocalDate kpiDate;
    @Column(precision = 8, scale = 2, nullable = false)
    private BigDecimal kpiValue;
}
