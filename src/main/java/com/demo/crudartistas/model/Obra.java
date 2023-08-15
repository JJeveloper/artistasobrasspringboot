package com.demo.crudartistas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "obra")
public class Obra {

    @Id
    @Column(name = "idobra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "autor", nullable = false)
    Autor autor;

    @ManyToOne
    @JoinColumn(name = "tipodeobra", nullable = false)
    TipoObra tipoObra;

    @Column(name = "comentario", nullable = false)
    private String comentario;

    public Obra() {
    }

    public Obra(int id, String nombre, Autor autor, TipoObra tipoObra, String comentario) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.tipoObra = tipoObra;
        this.comentario = comentario;
    }

    public Obra(String nombre, Autor autor, TipoObra tipoObra, String comentario) {
        this.nombre = nombre;
        this.autor = autor;
        this.tipoObra = tipoObra;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public TipoObra getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(TipoObra tipoObra) {
        this.tipoObra = tipoObra;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
