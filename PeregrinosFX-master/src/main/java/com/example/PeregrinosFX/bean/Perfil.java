package com.example.PeregrinosFX.bean;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public enum Perfil {
    INVITADO(1),
    PEREGRINO(2),
    PARADA(3),
    ADMINPARADA(4);

    private final Integer id;
    private static final Map<Integer, Perfil> reverse;

    static{
        reverse = new HashMap<>();
        for (Perfil perfil: Perfil.values()){
            reverse.put(perfil.id, perfil);
        }

    }
    Perfil(int id){
        this.id = id;
    }
    public Integer id(){
        return id;
    }
    public static Perfil byId(Integer id){
        Perfil result = reverse.get(id);
        if(result == null){
            throw new NoSuchElementException("PERFIN CON ID " + id + " NO EXISTE");
        }
        return result;
    }

}
