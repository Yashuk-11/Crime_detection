package com.example.crimedetection.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="crimepoll")
public class Crimeentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long crimeid;
    //@Column(name = "cri")
    private String crimetype;
  //  private Integer selectionCount;
}
