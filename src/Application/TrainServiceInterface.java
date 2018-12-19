package Application;

import DataRepresentation.RollingComponent;
import DataRepresentation.RollingComponentType;
import DataRepresentation.Train;

import java.util.ArrayList;

public interface TrainServiceInterface {

    void newTrain(RollingComponent rollingComponent, String id);

    void deleteTrain(Train id);

    void newRollingComponent(RollingComponentType type, String id, int seats);

    void newRollingComponent(RollingComponentType type, String id);

    void addRollingComponentToTrain(Train train, RollingComponent rollingComponent);

    void deleteRollingComponentFromTrain(Train train, RollingComponent rollingComponent);

    void deleteRollingComponent(RollingComponent rollingComponent);
    ArrayList<Train> getTrains();

    ArrayList<RollingComponent> getRollingComponents();
}
