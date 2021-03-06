package Presentation;

import Data.XStreamTester;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Launch  extends Application  {



    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Rich rail");
        primaryStage.setScene(new Scene(root, 640, 600));
        primaryStage.getScene().getStylesheets().add("bootstrap.css");
        primaryStage.show();
        XStreamTester.XmlToObject();
    }



    public static void launch(String[] args) {
        launch(args);
    }
}
