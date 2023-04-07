package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import javax.xml.crypto.Data;
import java.io.Serializable;

@Entity
public class Korisnik implements Serializable {

    @Column
    private String ime;
    @Column
    private String prezime;
    @Column
    private String korisnick_ime;
    @Column
    private String email_adresa;
    @Column
    private String lozinka;
    @Column
    private Data datum_rodjenja;
    @Column
    private  String opis;

    // profilna slika
    // uloga




}
