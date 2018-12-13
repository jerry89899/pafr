package Data;

import DataRepresentation.RollingComponent;
import DataRepresentation.TrainFactory;

import java.util.ArrayList;

public interface DatabaseConnection {
//    private ArrayList<Train> trains;
    ArrayList<TrainFactory> GetAllTrains();
    void AddTrain(TrainFactory t);
    boolean DeleteTrain(int trainIndex);
    ArrayList<RollingComponent> GetAllRollingComponents();
    void AddTrain(RollingComponent rollingComponent);

}
