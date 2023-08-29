package com.example.crimedetection.services;

import com.example.crimedetection.model.Crimemodel;
import com.example.crimedetection.model.Usermodel;

public interface Crimeservices {
    Crimemodel createcrime(Crimemodel c);
    int countitem(String cimetype);
}
