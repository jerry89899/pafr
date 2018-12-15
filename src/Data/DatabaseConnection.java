package Data;

import DataRepresentation.RollingComponent;
import DataRepresentation.Train;

import java.util.ArrayList;

public interface DatabaseConnection {
    //SaveTrain

    ArrayList<Train> getAllTrains();
    void addTrain(Train t);
    boolean deleteTrain(String trainID);
    ArrayList<RollingComponent> getAllRollingComponents();
    void addRollingComponent(RollingComponent rollingComponent);

}
