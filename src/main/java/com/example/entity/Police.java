package com.example.entity;

import jakarta.persistence.Entity;
import java.io.Serializable;

@Entity
public class Police implements Serializable {

    private String naziv;

    private int oznaka;

    private StavkaPolice stavkaPolice;


}
