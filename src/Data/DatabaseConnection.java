package Data;

import java.util.ArrayList;

public interface DatabaseConnection {
    //SaveTrain

    ArrayList<TrainFactory> getAllTrains();
    void addTrain(TrainFactory t);
    boolean deleteTrain(String trainID);
    ArrayList<RollingComponent> getAllRollingComponents();
    void addRollingComponent(RollingComponent rollingComponent);

}
