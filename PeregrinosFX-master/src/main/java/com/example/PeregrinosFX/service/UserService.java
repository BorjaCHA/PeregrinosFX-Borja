package com.example.PeregrinosFX.service;

import com.example.PeregrinosFX.bean.User;
import com.example.PeregrinosFX.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;


public interface UserService extends GenericService <User> {

    boolean autentico(String usuario, String contrasenia);

    User findByUsuario(String usuario);
}
