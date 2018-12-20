package Application;

import DataRepresentation.RollingComponent;
import DataRepresentation.RollingComponentType;
import DataRepresentation.Train;

import java.util.ArrayList;

public interface TrainServiceInterface {

    boolean newTrain(RollingComponent rollingComponent, String id);

    void deleteTrain(Train id);

    boolean newRollingComponent(RollingComponentType type, String id, int seats);

    boolean newRollingComponent(RollingComponentType type, String id);

    boolean addRollingComponentToTrain(Train train, RollingComponent rollingComponent);

    boolean deleteRollingComponentFromTrain(Train train, RollingComponent rollingComponent);

    boolean deleteRollingComponent(RollingComponent rollingComponent);
    ArrayList<Train> getTrains();

    ArrayList<RollingComponent> getRollingComponents();
}
