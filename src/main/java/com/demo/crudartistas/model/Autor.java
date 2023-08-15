package com.demo.crudartistas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @Column(name = "idautor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombres", nullable = false)
    private String nombres;

    @Column(name = "nacimiento", nullable = false)
    private String nacimiento;

    @Column(name = "ocupaciones", nullable = false)
    private String ocupaciones;

    @Column(name = "fallecimiento", nullable = false)
    private String fallecimiento;

    public Autor() {
    }

    public Autor(int id, String nombres, String ocupaciones, String nacimiento, String fallecimiento) {
        this.id = id;
        this.nombres = nombres;
        this.ocupaciones = ocupaciones;
        this.nacimiento = nacimiento;
        this.fallecimiento = fallecimiento;
    }

    public Autor(String nombres, String ocupaciones, String nacimiento, String fallecimiento) {
        this.nombres = nombres;
        this.ocupaciones = ocupaciones;
        this.nacimiento = nacimiento;
        this.fallecimiento = fallecimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getOcupaciones() {
        return ocupaciones;
    }

    public void setOcupaciones(String ocupaciones) {
        this.ocupaciones = ocupaciones;
    }

    public String getFallecimiento() {
        return fallecimiento;
    }

    public void setFallecimiento(String fallecimiento) {
        this.fallecimiento = fallecimiento;
    }

}
