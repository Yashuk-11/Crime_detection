package com.example.crimedetection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Crimemodel {
    private Long crimeid;
    private String crimetype;
    //private Integer selectionCount;
}
