package com.demo.crudartistas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipodeobra")
public class TipoObra {

    @Id
    @Column(name = "idtipodeobra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipodeobra", nullable = false)
    private String tipodeobra;

    public TipoObra() {
    }

    public TipoObra(String tipodeobra) {
        this.tipodeobra = tipodeobra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipodeobra() {
        return tipodeobra;
    }

    public void setTipodeobra(String tipodeobra) {
        this.tipodeobra = tipodeobra;
    }


}

