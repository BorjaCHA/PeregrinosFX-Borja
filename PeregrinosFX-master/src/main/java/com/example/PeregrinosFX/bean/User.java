package com.example.PeregrinosFX.bean;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idUsuario",updatable = false,nullable = false)

    private String usuario;

    private String contraseña;

    private Perfil perfil;

    private Peregrino peregrinos;

    private ArrayList<Parada> paradas;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Peregrino getPeregrinos() {
        return peregrinos;
    }

    public void setPeregrinos(Peregrino peregrinos) {
        this.peregrinos = peregrinos;
    }

    public ArrayList<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(ArrayList<Parada> paradas) {
        this.paradas = paradas;
    }

    @Override
    public String toString() {
        return "User{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", perfil=" + perfil +
                ", peregrinos=" + peregrinos +
                ", paradas=" + paradas +
                '}';
    }
}
