package com.example.crimedetection.repository;

import com.example.crimedetection.Entity.Userentity;
import com.example.crimedetection.services.Userservices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface Userrepository extends JpaRepository<Userentity, Integer>{
    Userentity findByName(String name);
    //@Query("select u from Userentity u where u.email=?1")
   // public  Userentity findByEmail(String email);
   // Map<Object, Object> findByEmail(String email);
   Userentity findByEmail(String email);
   //@Query("select aadhar from Userentity where aadhar=?1")
   Userentity findByAadhar(String aadhar);
}
