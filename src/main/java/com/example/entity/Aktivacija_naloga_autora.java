package com.example.entity;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

enum Status {NA_CEKANJU, ODOBREN, ODBIJEN};

@Entity
public class Aktivacija_naloga_autora implements Serializable {

    private String emial;

    private String telefonl;

    private String poruka;

    private Date datum;

    private Status status;


}
