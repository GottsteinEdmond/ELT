package com.example.smartcatinterview.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Allowance {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID allowanceId;
    @Column(nullable = false)
    private Float allowanceValue;
    @Column(precision = 8, scale = 2, nullable = false)
    private BigDecimal allowanceCost;
    @ManyToOne
    @JoinColumn(name = "shift_id", referencedColumnName = "shift_id")
    private Shift shift;

}
