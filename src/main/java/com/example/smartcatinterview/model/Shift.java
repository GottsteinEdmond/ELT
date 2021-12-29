package com.example.smartcatinterview.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Entity(name = "shifts")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shift {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "shift_id")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID shifId;
    @Column(nullable = false, name = "shift_date")
    private LocalDate shiftDate;
    @Column(nullable = false, name = "shift_start")
    private Timestamp shiftStart;
    @Column(nullable = false, name = "shift_finish")
    private Timestamp shiftFinish;
    @Column(precision = 13, scale = 4, name = "shift_cost")
    private BigDecimal shiftCost;

//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "shift")
    @OneToMany(mappedBy = "shift", targetEntity = Break.class)
    private Set<Break> breaks;
    @OneToMany(mappedBy = "shift", targetEntity = Allowance.class)
    private Set<Allowance> allowances;
    @OneToMany(mappedBy = "shift", targetEntity = AwardInterpretation.class)
    private Set<AwardInterpretation> awardInterpretations;


}
