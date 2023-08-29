package com.example.crimedetection.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="complaints")
public class Complaintentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Column(nullable = false)
    private String aadhar;
    @Column(nullable = false)
    private String loc;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String descp;





}
