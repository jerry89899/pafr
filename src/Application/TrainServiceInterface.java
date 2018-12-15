package Application;

import DataRepresentation.RollingComponent;
import DataRepresentation.RollingComponentType;
import DataRepresentation.Train;

import java.util.ArrayList;

public interface TrainServiceInterface {

    void NewTrain(String Name, RollingComponent rollingComponent);
    void DeleteTrain(String trainID);
    void NewRollingComponent(RollingComponentType type, String Name, int seats);
    void AddRollingComponentToTrain(String trainid, String rollingcomponentid);
    boolean DeleteRollingComponentFromTrain(int trainIndex, int rollingComponentIndex);
    ArrayList<Train> getTrains();
    ArrayList<RollingComponent> getRollingComponents();
}
