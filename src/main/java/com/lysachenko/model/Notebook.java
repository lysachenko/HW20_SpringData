package com.lysachenko.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Notebook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String manufacturer;
    private String processor;
    private int memory;
    private boolean wasInUse;
    private String hullType;
    private double price;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOfIssue;

}
