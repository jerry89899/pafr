package Application;

import DataRepresentation.RollingComponent;
import DataRepresentation.RollingComponentType;
import DataRepresentation.Train;

import java.util.ArrayList;

public interface TrainServiceInterface {

    void NewTrain( RollingComponent rollingComponent, String Name);

    void DeleteTrain(Train id);

    void NewRollingComponent(RollingComponentType type, String Name, int seats);

    void NewRollingComponent(RollingComponentType type, String Name);

    void AddRollingComponentToTrain(Train train, RollingComponent rollingComponent);

    boolean DeleteRollingComponentFromTrain(Train train, RollingComponent rollingComponent);

    ArrayList<Train> getTrains();

    ArrayList<RollingComponent> getRollingComponents();
}
