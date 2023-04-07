package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
public class Zanr implements Serializable {

    @Column
    private String naziv;

}
