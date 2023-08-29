package com.example.crimedetection.services;

import com.example.crimedetection.Entity.Complaintentity;
import com.example.crimedetection.Entity.Userentity;
import com.example.crimedetection.model.Complaintmodel;
import com.example.crimedetection.model.Usermodel;
import com.example.crimedetection.repository.Complaintrepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService implements Complaintservices {
    private final Complaintrepository comrepo;
     public ComplaintService(Complaintrepository comrepo){

         this.comrepo=comrepo;
     }

     @Override
     public Complaintmodel createComplaint(Complaintmodel c){
         Complaintentity compen=new Complaintentity();
         BeanUtils.copyProperties(c,compen);
         comrepo.save(compen);
         return c;
     }


}
