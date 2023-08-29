package com.example.crimedetection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Complaintmodel {

    private Long cid;
    private String aadhar;
    private String loc;
    private String date;
    private String descp;
}
