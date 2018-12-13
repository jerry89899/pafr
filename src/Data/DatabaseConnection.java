package Data;

import DataRepresentation.RollingComponent;
import DataRepresentation.TrainFactory;

import java.util.ArrayList;

public interface DatabaseConnection {
//    private ArrayList<Train> trains;
    ArrayList<TrainFactory> GetAllTrains();
    void AddTrain(TrainFactory t);
    void DeleteTrain(int trainIndex);
    public ArrayList<RollingComponent> GetAllRollingComponents();
    public void AddTrain(RollingComponent rollingComponent);

}
