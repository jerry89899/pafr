package Application;

import Data.DatabaseConnection;
import Data.LocalDB;
import DataRepresentation.LocomotiveBasic;
import DataRepresentation.RollingComponent;
import DataRepresentation.TrainFactory;

import java.util.ArrayList;

public class TrainService implements TrainRepositoryInterface, TrainServiceInterface {
//
//    public TrainFactory train;
//    public TrainRepositoryInterface trainRepo;
//
////     maakt trein
//    public TrainFactory t1 = train.getPullables();
    DatabaseConnection dbc = new LocalDB();



    public void NewTrain(String name){//
        TrainFactory t = TrainFactory.getTrainPart("LocomotiveBasic",20, name);
        Train t = new Train(name);
        dbc.AddTrain(t);
    }
    public void DeleteTrain(int trainIndex){

    }
    public void NewRollingComponent(RollingComponentType type, String Name, int seats){

    }
    public void AddRollingComponentToTrain(String Name, int numSeats){

    }
    public boolean DeleteRollingComponentFromTrain(int trainIndex, int rollingComponentIndex){
        return true;
    }
    public ArrayList<Train> getTrains(){
        return dbc.GetAllTrains();
    }
    ArrayList<RollingComponent> getRollingComponents(){
        return dbc.GetAllRollingComponents();
    }








}
