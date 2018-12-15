package Data;

import DataRepresentation.RollingComponent;
import DataRepresentation.Train;

import java.util.ArrayList;

public interface DatabaseConnection {
    //SaveTrain

    ArrayList<Train> getAllTrains();
    void addTrain(Train train);
    void deleteTrain(Train train);
    void saveTrain(Train train);
    ArrayList<RollingComponent> getAllRollingComponents();
    void addRollingComponent(RollingComponent rollingComponent);


}
