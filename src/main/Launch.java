package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Launch  extends Application  {



    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("../Presentation/main.fxml"));
        primaryStage.setTitle("Rich rail");
        primaryStage.setScene(new Scene(root, 640, 600));
        primaryStage.getScene().getStylesheets().add("/Presentation/bootstrap.css");
        primaryStage.show();

    }



    public static void launch(String[] args) {
        launch(args);
    }
}
