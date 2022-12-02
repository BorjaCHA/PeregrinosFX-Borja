package com.example.PeregrinosFX.controller;

import com.example.PeregrinosFX.bean.User;
import com.example.PeregrinosFX.config.StageManager;
import com.example.PeregrinosFX.service.impl.UserServiceImpl;
import com.example.PeregrinosFX.view.FxmlView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class LoginController implements Initializable {

    @Lazy
    @Autowired
    private StageManager stageManager;

    @Autowired
    private UserServiceImpl userService;
    @FXML
    private javafx.scene.control.Label userLBL;

    @FXML
    private javafx.scene.control.Label contrasenaLBL;

    @FXML
    private javafx.scene.control.TextField usuarioTF;

    @FXML
    private javafx.scene.control.TextField contrasenaTF;

    @FXML
    private javafx.scene.control.Button aceptarBTN;

    @FXML
    private Button cancelarBTN;


    @FXML
    private void login(ActionEvent event) throws IOException {
        if (userService.autentico(getUsuarioTF(), getContrasenaTF())) {
            User u = userService.findByUsuario(getUsuarioTF());
            stageManager.switchScene(FxmlView.MENUADMINPARADA);
            Long idPerfil =u.getPerfil().getIdPerfil();
            if (idPerfil == 1) {
                stageManager.switchScene(FxmlView.MENUPEREGRINO);

            } else if (idPerfil == 2) {
                stageManager.switchScene(FxmlView.MENUADMINPARADA);

            } else if (idPerfil == 3) {
                stageManager.switchScene(FxmlView.MENUADMINGENERAL);

            }
        } else {
            userLBL.setText("LOGIN FAILED");


        }
    }

    @FXML
    private void volverAlMenu(ActionEvent event) throws IOException {
        stageManager.switchScene(FxmlView.MENUPRINCIPAL);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public StageManager getStageManager() {
        return stageManager;
    }

    public void setStageManager(StageManager stageManager) {
        this.stageManager = stageManager;
    }


    public String getUsuarioTF() {
        return usuarioTF.getText();
    }


    public String getContrasenaTF() {
        return contrasenaTF.getText();
    }


}