package com.example.entity;

import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
public class StavkaPolice implements Serializable {

    private String recenzijaKnjige;

    private Knjiga knjiga;



}
