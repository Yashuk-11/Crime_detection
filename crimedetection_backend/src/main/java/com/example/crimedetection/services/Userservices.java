package com.example.crimedetection.services;

import com.example.crimedetection.Entity.Userentity;
import com.example.crimedetection.model.Usermodel;
import com.example.crimedetection.repository.Userrepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class Userservices implements userservice{
    private final Userrepository userrepo;
    public  Userservices(Userrepository userrepo){

        this.userrepo=userrepo;
    }
    @Override
    public Usermodel createUser(Usermodel c){
        Userentity useren=new Userentity();
        BeanUtils.copyProperties(c,useren);
        userrepo.save(useren);
        return c;
    }
/*
    @Override
    public Usermodel getPasswordById(String email){
        Userentity u=userrepo.findByEmail(email);
       // if(u!=null)
            return new Usermodel(u);


    }*/


    public boolean checkPassword(String email, String password) {
        Userentity userEntity = userrepo.findByEmail(email);

        if (userEntity != null) {
            return userEntity.getPassword().equals(password);
        }

        return false;
    }

    public boolean checkAadhar(String aadhar,String name) {
        Userentity userentity = userrepo.findByName(name);
        if(userentity!=null){
            return userentity.getAadhar().equals(aadhar);
        }
        return false;
    }
}
