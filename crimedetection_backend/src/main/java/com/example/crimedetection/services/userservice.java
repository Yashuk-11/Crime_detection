package com.example.crimedetection.services;

//import com.example.crimedetection.CrimedetectionApplication;
import com.example.crimedetection.model.Usermodel;

public interface userservice {

   // CrimedetectionApplication createUser(CrimedetectionApplication c);

    Usermodel createUser(Usermodel c);
    boolean checkPassword(String email, String password);
    //Usermodel getPasswordById(String email);

    boolean checkAadhar(String aadhar,String name);
}
