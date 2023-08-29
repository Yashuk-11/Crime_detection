package com.example.crimedetection.repository;

import com.example.crimedetection.Entity.Complaintentity;
import com.example.crimedetection.Entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Complaintrepository extends JpaRepository<Complaintentity, Long> {
}
