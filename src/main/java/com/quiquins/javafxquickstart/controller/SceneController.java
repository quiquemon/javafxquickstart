package com.quiquins.javafxquickstart.controller;

import java.util.HashMap;
import java.util.Map;

import com.quiquins.javafxquickstart.ViewEnum;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

	private static Stage mainStage;
	private static final Map<ViewEnum, Scene> scenes = new HashMap<>();

	public static void setStage(Stage stage) {
		mainStage = stage;
	}

	public static void addScene(ViewEnum view, Scene scene) {
		scenes.put(view, scene);
	}

	public static void activateScene(ViewEnum view) {
		mainStage.setScene(scenes.get(view));
	}
}
