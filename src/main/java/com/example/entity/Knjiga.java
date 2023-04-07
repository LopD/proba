package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Knjiga implements Serializable {
    @Column
    private  String naslov;

    // naslovna fotografija
    @Column
    private long ISBN;
    @Column
    private Date datumObjavljivanja;
    @Column
    private int brojStrana;
    @Column
    private String opis;
    @Column
    private Zanr zanr;
    @Column
    private int ocena;




}
