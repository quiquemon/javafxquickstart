package com.quiquins.javafxquickstart.controller;

import com.quiquins.javafxquickstart.ViewEnum;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class HoloxController {

	@FXML
	private Button btnHolox;

	@FXML
	private Button btnCambiarVentana;

	@FXML
	private void initialize() {
		btnHolox.setOnAction(e -> {
			final Alert alert = new Alert(AlertType.INFORMATION);

			alert.initOwner(btnHolox.getScene().getWindow());
			alert.setTitle("Diálogo de Holox");
			alert.setContentText("Holox Mi Gentecita!!!");

			alert.showAndWait();
		});

		btnCambiarVentana.setOnAction(e -> {
			SceneController.activateScene(ViewEnum.GATO);
		});
	}
}
