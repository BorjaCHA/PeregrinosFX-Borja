package com.example.PeregrinosFX.bean;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "carnets")
public class Carnet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPeregrino", updatable = false, nullable = false)
    private long idPeregrino;

    private LocalDate fechaExp;

    private double distancia;

    private int numVips;


    @OneToOne(mappedBy = "carnet")
    private long idParada;


    public long getIdPeregrino() {
        return idPeregrino;
    }

    public void setIdPeregrino(long idPeregrino) {
        this.idPeregrino = idPeregrino;
    }

    public LocalDate getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(LocalDate fechaExp) {
        this.fechaExp = fechaExp;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getNumVips() {
        return numVips;
    }

    public void setNumVips(int numVips) {
        this.numVips = numVips;
    }

    public long getIdParada() {
        return idParada;
    }

    public void setIdParada(long idParada) {
        this.idParada = idParada;
    }

    @Override
    public String toString() {
        return "Carnet{" +
                "idPeregrino=" + idPeregrino +
                ", fechaExp=" + fechaExp +
                ", distancia=" + distancia +
                ", numVips=" + numVips +
                ", idParada=" + idParada +
                '}';
    }
}
