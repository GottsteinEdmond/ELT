package com.example.smartcatinterview.repository;

import com.example.smartcatinterview.model.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShiftRepository extends JpaRepository<Shift, UUID> {
}
