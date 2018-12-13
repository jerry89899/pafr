package Application;

import DataRepresentation.RollingComponent;

import java.util.ArrayList;

public interface TrainServiceInterface {

    void NewTrain(String Name);
    void DeleteTrain(int trainIndex);
    void NewRollingComponent(RollingComponentType type, String Name, int seats);
    void AddRollingComponentToTrain(String Name, int numSeats);
    boolean DeleteRollingComponentFromTrain(int trainIndex, int rollingComponentIndex);
    ArrayList<Train> getTrains();
    ArrayList<RollingComponent> getRollingComponents();
}
