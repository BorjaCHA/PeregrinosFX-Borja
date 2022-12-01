package com.example.PeregrinosFX.controller;


import com.example.PeregrinosFX.config.StageManager;
import com.example.PeregrinosFX.view.FxmlView;
import javafx.fxml.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
public class RegistroController implements Initializable {

    @Lazy
    @Autowired
    private StageManager stageManager;

    @FXML
    private Label nombreLBL;

    @FXML
    private Label usuarioLBL;

    @FXML
    private Label contrasenaLBL;

    @FXML
    private Label confirmcontraLBL;

    @FXML
    private Label paradaLBL;

    @FXML
    private Label nacionalidadLBL;

    @FXML
    private TextField nombreTF;

    @FXML
    private TextField usuarioTF;

    @FXML
    private TextField contrasenaTF;

    @FXML
    private TextField confirmcontraTF;

    @FXML
    private ComboBox paradaCB;

    @FXML
    private ComboBox nacionalidadCB;

    @FXML
    private Button aceptarBTN;

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
