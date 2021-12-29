package com.example.smartcatinterview.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
public class Break {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID breakId;
    @ManyToOne
    @JoinColumn(name = "shift_id", referencedColumnName = "shift_id")
    private Shift shift;
    @Column(nullable = false)
    private Timestamp breakStart;
    @Column(nullable = false)
    private Timestamp breakFinish;
    @ColumnDefault("false")
    private Boolean isFinished;
}
