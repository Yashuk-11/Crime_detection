package com.example.crimedetection.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name="Userdetail")

public class Userentity {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter
    @Column(nullable = false,unique = true,length = 12)
    private String aadhar;
    @Column(nullable = false,length = 55)
    private String address;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false,unique = true,length = 10)
    private String mob;
    @Getter
    @Column(nullable = false,length = 20)
    private String name;
    @Getter
    @Column(nullable = false,length = 20)
    private String password;
    public int getId() {
        return id;
    }

    public String getAadhar() {
        return aadhar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public String getName(){
        return this.name;
    }

}
