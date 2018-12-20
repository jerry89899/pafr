package Presentation;

//import domain.Motor;
//import domain.Pullable;
//import domain.Vehicle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class LogOutput extends VBox implements Output {
    @FXML private TextFlow outputfield;
    FXMLLoader fxmlLoader;
    public LogOutput(){
        fxmlLoader = new FXMLLoader(getClass().getResource(
                "/log_output.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();

          //  showVehicle(new Vehicle());
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }



//    @Override
//    public void showVehicle(Vehicle vehicle) {
//        Text showV = new Text(10, 30, vehicle + " created \n");
//        showV.setFill(Color.WHITE);
//        this.outputfield.getChildren().add(showV);
//
//
//    }
//
//    @Override
//    public void showNumseats(Vehicle vehicle) {
//        Text showN = new Text("number of seats in " + vehicle + " " + vehicle.getId() + " " + vehicle.getSeats() + " \n");
//        showN.setFill(Color.WHITE);
//        outputfield.getChildren().addAll(showN);
//    }
//
//
//    @Override
//    public void addVehicleToMotor(Motor motor, Pullable vehicle) {
//    /*    Integer position;
//        Vehicle vehicleMotor = (Vehicle) motor;*/
//
//        Text addV = new Text("added " + vehicle + " to " + motor + " \n");
//        addV.setFill(Color.WHITE);
//        outputfield.getChildren().addAll(addV);
//    }
//
//    @Override
//    public void removeVehicleFromMotor(Motor motor, Pullable vehicle) {
//        Text removeVFM = new Text("removed "+vehicle+" from " + motor + " \n");
//        removeVFM.setFill(Color.WHITE);
//        outputfield.getChildren().addAll(removeVFM);
//    }
//
//    @Override
//    public void removeVehicle(Vehicle vehicle) {
//        Text removeV = new Text(vehicle.getId() + " deleted \n");
//        removeV.setFill(Color.WHITE);
//        outputfield.getChildren().addAll(removeV);
//    }
//
//    @Override
//    public void showErrorMessage(String message) {
//        Text showE = new Text(message + "\n");
//        showE.setFill(Color.RED);
//        outputfield.getChildren().addAll(showE);
//    }
}