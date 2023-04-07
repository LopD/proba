package com.example.entity;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Recenzija implements Serializable {

    private int ocena;

    private String tekst;

    private Date datumRecenzije;

    private Korisnik korisnik;


}
