package com.example.PeregrinosFX.controller;

import com.example.PeregrinosFX.config.StageManager;
import com.example.PeregrinosFX.view.FxmlView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class LoginController implements Initializable {

    @Lazy
    @Autowired
    private StageManager stageManager;

    @FXML
    private javafx.scene.control.Label usuarioLBL;

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
    private void volverAlMenu(ActionEvent event) throws IOException {
        stageManager.switchScene(FxmlView.MENUPRINCIPAL);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}