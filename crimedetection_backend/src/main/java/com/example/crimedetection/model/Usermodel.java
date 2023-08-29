package com.example.crimedetection.model;

import com.example.crimedetection.Entity.Userentity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usermodel {

    private int id;
    private String aadhar;
    private String address;
    private String email;
    private String gender;
    private String mob;
    private String name;
    private String password;

    public Usermodel(Userentity u) {
    }
}


