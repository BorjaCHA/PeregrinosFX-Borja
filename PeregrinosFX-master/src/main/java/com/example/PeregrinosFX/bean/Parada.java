package com.example.PeregrinosFX.bean;


import jakarta.persistence.*;

@Entity
@Table(name="paradas")
public class Parada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    @Column(name="idParada", updatable = false, nullable = false)
    private long idParada;

    private String nombre;


    private char region;


    public long getIdParada() {
        return idParada;
    }

    public void setIdParada(long idParada) {
        this.idParada = idParada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getRegion() {
        return region;
    }

    public void setRegion(char region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Parada{" +
                "idParada=" + idParada +
                ", nombre='" + nombre + '\'' +
                ", region=" + region +
                '}';
    }
}
