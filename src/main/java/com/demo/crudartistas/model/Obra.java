package com.demo.crudartistas.model;

import jakarta.persistence.*;

@Entity(name = "obra")
@Table
public class Obra {

    @Id
    @Column(name = "idobra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor", nullable = false)
    private Autor autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipodeobra", nullable = false)
    private TipoObra tipodeobra;

    @Column(name = "comentario", nullable = false)
    private String comentario;

    public Obra() {
    }

    public Obra(int id, String nombre, Autor autor, TipoObra tipodeobra, String comentario) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.tipodeobra = tipodeobra;
        this.comentario = comentario;
    }

    public Obra(String nombre, Autor autor, TipoObra tipodeobra, String comentario) {
        this.nombre = nombre;
        this.autor = autor;
        this.tipodeobra = tipodeobra;
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
        return tipodeobra;
    }

    public void setTipoObra(TipoObra tipodeobra) {
        this.tipodeobra = tipodeobra;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", autor=" + autor +
                ", tipoObra=" + tipodeobra +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
