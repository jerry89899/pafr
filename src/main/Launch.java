package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Launch  extends Application  {



    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("../presentation/main.fxml"));
        primaryStage.setTitle("Rich rail");
        primaryStage.setScene(new Scene(root, 640, 600));
        primaryStage.getScene().getStylesheets().add("/presentation/bootstrap.css");
        primaryStage.show();

    }



    public static void launch(String[] args) {
        launch(args);
    }
}
