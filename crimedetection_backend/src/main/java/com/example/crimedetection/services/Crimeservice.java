package com.example.crimedetection.services;

import com.example.crimedetection.Entity.Crimeentity;

import com.example.crimedetection.model.Crimemodel;

import com.example.crimedetection.repository.Crimerepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Crimeservice implements Crimeservices{
    private final Crimerepository cr;
   // @Autowired
    public  Crimeservice(Crimerepository cr){

        this.cr=cr;
    }
    @Override
    public Crimemodel createcrime(Crimemodel c){
        Crimeentity crime=new Crimeentity();
        //crime.setCrimetype(c.getCrimetype());
        BeanUtils.copyProperties(c,crime);
        cr.save(crime);
        return c;
    }

    public int countitem(String crimetype){
        return cr.countitem(crimetype);
    }
}
