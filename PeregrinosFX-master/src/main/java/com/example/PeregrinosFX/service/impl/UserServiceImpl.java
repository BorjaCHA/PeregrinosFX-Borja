package com.example.PeregrinosFX.service.impl;

import com.example.PeregrinosFX.bean.User;
import com.example.PeregrinosFX.config.StageManager;
import com.example.PeregrinosFX.repository.UserRespository;
import com.example.PeregrinosFX.service.UserService;
import com.example.PeregrinosFX.view.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRespository userRespository;


    @Override
    public boolean autentico(String usuario, String contrasenia) {
        User user = findByUsuario(usuario);
        if (user == null) {
            return false;
        } else {
            if ((contrasenia.equals(user.getContrasenia()))) {
                return true;
            }
        }

        return false;
    }

    @Override
    public User findByUsuario(String username) {
        return userRespository.findByUsuario(username);
    }


    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User find(Long id) {
        return null;
    }


}
