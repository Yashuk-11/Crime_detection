package com.example.crimedetection.controller;

import com.example.crimedetection.CrimedetectionApplication;
import com.example.crimedetection.Entity.Userentity;
import com.example.crimedetection.model.Usermodel;
import com.example.crimedetection.services.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class Usercontroller {
    @Autowired
    private userservice user;

    public Usercontroller(userservice user) {

        this.user = user;
    }

    @PostMapping("/Crimedetection")
    public Usermodel createUser(@RequestBody Usermodel c) {

        return user.createUser(c);
    }

   /* @PostMapping("./checkpassword")
   public ResponseEntity<Boolean> getPasswordById(@RequestParam String email,@RequestParam String Password){
        Userentity u=userre;
        u=user.getPasswordById(email);
        return ResponseEntity.ok(u);
    }*/

    @PostMapping("/check-password")
    public ResponseEntity<Boolean> checkPassword(@RequestBody Map<String, String> requestMap) {
        String email = requestMap.get("email");
        String password = requestMap.get("password");
        boolean isPasswordMatch = user.checkPassword(email, password);
        return ResponseEntity.ok(isPasswordMatch);
    }

    @PostMapping("/check-aadhar")
    public ResponseEntity<Boolean> checkAadhar(@RequestBody Map<String, String> requestMap) {
       String aadhar = requestMap.get("aadhar");
       String name = requestMap.get("name");
        System.out.println("Received Aadhar: " + aadhar + ", Name: " + name);
        boolean isPasswordMatch = user.checkAadhar(aadhar,name);

        return ResponseEntity.ok(isPasswordMatch);
    }
}


