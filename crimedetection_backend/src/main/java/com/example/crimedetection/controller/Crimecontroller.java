package com.example.crimedetection.controller;
import com.example.crimedetection.model.Crimemodel;
import com.example.crimedetection.services.Crimeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class Crimecontroller {

    @Autowired
    private Crimeservice user;

    public Crimecontroller(Crimeservice user)
    {

        this.user=user;
    }

    @PostMapping("/Crime")
    public Crimemodel createcrime(@RequestBody Crimemodel c)
    {

        return user.createcrime(c);
    }

    @GetMapping("/counttype")
    public int countitem(@RequestParam String crimetype){
        return user.countitem(crimetype);
    }
}
