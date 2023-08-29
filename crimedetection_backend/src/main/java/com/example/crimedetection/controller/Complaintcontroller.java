package com.example.crimedetection.controller;

import com.example.crimedetection.model.Complaintmodel;
import com.example.crimedetection.model.Usermodel;
import com.example.crimedetection.services.Complaintservices;
import com.example.crimedetection.services.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class Complaintcontroller {

    @Autowired
    private Complaintservices comser;

    public Complaintcontroller(Complaintservices comser)
    {

        this.comser=comser;
    }

    @PostMapping("/Complaint")
    public Complaintmodel createComplaint(@RequestBody Complaintmodel c)
    {

        return comser.createComplaint(c);
    }

}
