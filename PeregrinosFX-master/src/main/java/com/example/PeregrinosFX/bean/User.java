package com.example.PeregrinosFX.bean;

import javax.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", updatable = false, nullable = false)
    private long idUser;


    private String usuario;

    private String contraseña;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPerfil")
    private Perfil perfil;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

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


    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", perfil=" + perfil +
                '}';
    }
}
