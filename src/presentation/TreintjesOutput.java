package presentation;

//import domain.Motor;
//import domain.Pullable;
//import domain.Vehicle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TreintjesOutput extends VBox {
    private FXMLLoader fxmlLoader;
    @FXML
    private Pane trainpane;
    private Map<String, HBox> addedTrains = new HashMap<>();
    private Map<String, Double> motorYPositions = new HashMap<>(); // sla alle aangemaakte motors op met Y positie, zodat ze onder elkaar kunnen worden geplaatst.
    public TreintjesOutput(){
        fxmlLoader = new FXMLLoader(getClass().getResource(
                "../presentation/treintjes.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
//    @Override
//    public void showVehicle(Vehicle vehicle)
//    {
//        final HBox hBox = new HBox();
//        final ImageView vehicleView = new ImageView(new Image(TreintjesOutput.class.getResourceAsStream(vehicle.getImage())));
//        vehicleView.setId(vehicle.getId());
//
//        if(vehicle instanceof Motor){
//            hBox.getChildren().add(vehicleView);
//            hBox.setLayoutY(this.getNewYPosForMotor());
//            addedTrains.put(vehicle.getId(), hBox);
//            motorYPositions.put(vehicle.getId(), vehicleView.getImage().getHeight());
//            trainpane.getChildren().addAll(hBox);
//        } else {
//            trainpane.getChildren().addAll(vehicleView);
//        }
//    }

//    @Override
//    public void showNumseats(Vehicle vehicle) {
//        System.out.print("Voertuig heeft " + vehicle.getSeats() + " zitjes");
//    }

    /**
     * Recalculate the position of the vehicle image draw and show.
     * @param motor
     * @param vehicle
     */
//    @Override
//    public void addVehicleToMotor(Motor motor, Pullable vehicle) {
//        Vehicle pullableVehicle = (Vehicle) vehicle;
//        Vehicle motorVehicle = (Vehicle) motor;
//        ImageView vehicleView = (ImageView) trainpane.lookup("#"+pullableVehicle.getId());
//        HBox train = addedTrains.get(motorVehicle.getId());
//        train.getChildren().add(vehicleView);
//
//    }

//    @Override
//    public void removeVehicleFromMotor(Motor motor, Pullable vehicle) {
//        Vehicle pullableVehicle = (Vehicle) vehicle;
//        Vehicle motorVehicle = (Vehicle) motor;
//        ImageView vehicleView = (ImageView) trainpane.lookup("#"+pullableVehicle.getId());
//        HBox hbox = this.addedTrains.get(motorVehicle.getId());
//        hbox.getChildren().remove(vehicleView);
//        this.trainpane.getChildren().remove(vehicleView);
//    }
//
//    @Override
//    public void removeVehicle(Vehicle vehicle) {
//        if(vehicle instanceof Pullable && ((Pullable) vehicle).getPulledBy() != null){ // handel het juist af
//            removeVehicleFromMotor(((Pullable) vehicle).getPulledBy(), (Pullable) vehicle);
//        }
//        else {
//            trainpane.getChildren().removeAll(addedTrains.get(vehicle.getId()));
//            addedTrains.remove(vehicle.getId());
//            motorYPositions.remove(vehicle.getId());
//        }
//    }
//
//    @Override
//    public void showErrorMessage(String message) {
//        System.out.println(message);
//    }

    /**
     *
     * @return Y position after adding all Motors together.
     */
    private double getNewYPosForMotor(){
        double posy = 0;
        for (double pos:
             motorYPositions.values()) {
            posy+= pos;
        }
        return posy;
    }


}