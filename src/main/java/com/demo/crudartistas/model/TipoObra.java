package com.demo.crudartistas.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity(name = "tipodeobra")
@Table
public class TipoObra {

    @Id
    @Column(name = "idtipodeobra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombretipodeobra", nullable = false)
    private String nombretipodeobra;

    @OneToMany(mappedBy = "tipodeobra")
    private List<Obra> obra;

    public TipoObra() {
    }

    public TipoObra(Integer id, String nombretipodeobra, List<Obra> obra) {
        this.id = id;
        this.nombretipodeobra = nombretipodeobra;
        this.obra = obra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombretipodeobra() {
        return nombretipodeobra;
    }

    public void setNombretipodeobra(String nombretipodeobra) {
        this.nombretipodeobra = nombretipodeobra;
    }

    public List<Obra> getObra() {
        return obra;
    }

    public void setObras(List<Obra> obra) {
        this.obra = obra;
    }

}

