package com.quiquins.javafxquickstart;

import com.quiquins.javafxquickstart.controller.SceneController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class JavaFXApp extends Application {

	public static void launchApp( String[] args ) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		final Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/Holox.fxml"));
		final Scene scene = new Scene(root);

		primaryStage.setTitle("Holox");
		primaryStage.setScene(scene);
		primaryStage.show();

		initScenes(primaryStage);
	}

	private void initScenes(Stage primaryStage) throws Exception {
		SceneController.setStage(primaryStage);
		SceneController.addScene(ViewEnum.HOLOX, new Scene(FXMLLoader.load(getClass().getClassLoader().getResource("view/Holox.fxml"))));
		SceneController.addScene(ViewEnum.GATO, new Scene(FXMLLoader.load(getClass().getClassLoader().getResource("view/Gato.fxml"))));
	}
}
