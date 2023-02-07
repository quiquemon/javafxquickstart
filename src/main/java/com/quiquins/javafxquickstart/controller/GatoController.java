package com.quiquins.javafxquickstart.controller;

import com.quiquins.javafxquickstart.ViewEnum;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GatoController {

	public void onBtnMauClick(ActionEvent e) {
		final Scene scene = ((Node)e.getTarget()).getScene();
		final Alert alert = new Alert(AlertType.INFORMATION);

		alert.initOwner(scene.getWindow());
		alert.setTitle("Diálogo del Mau Mau");
		alert.setContentText("Mau Mau, Mau Mau, MAAAAAAAUUUUUU");

		alert.showAndWait();

		SceneController.activateScene(ViewEnum.HOLOX);
	}
}
