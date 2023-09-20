package com.demo.crudartistas.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "autor")
@Table
public class Autor {

    @Id
    @Column(name = "idautor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres", nullable = false, length = 2000)
    private String nombres;

    @Column(name = "nacimiento", nullable = false, length = 3000)
    private String nacimiento;

    @Column(name = "ocupaciones", nullable = false, length = 3000)
    private String ocupaciones;

    @Column(name = "fallecimiento", nullable = false, length = 3000)
    private String fallecimiento;

    @OneToMany(mappedBy = "autor")
    private List<Obra> obra;


    public Autor() {
    }

    public Autor(Integer id, String nombres, String nacimiento, String ocupaciones, String fallecimiento, List<Obra> obra) {
        this.id = id;
        this.nombres = nombres;
        this.nacimiento = nacimiento;
        this.ocupaciones = ocupaciones;
        this.fallecimiento = fallecimiento;
        this.obra = obra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public List<Obra> getObra() {
        return obra;
    }

    public void setObras(List<Obra> obra) {
        this.obra = obra;
    }
}
