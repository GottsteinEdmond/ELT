package com.example.smartcatinterview.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class AwardInterpretation {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID awardId;
    @ManyToOne
    @JoinColumn(name = "shift_id", referencedColumnName = "shift_id")
    private Shift shift;
    private LocalDate awardDate;
    private Float awardUnits;
    private BigDecimal awardCost;

}
