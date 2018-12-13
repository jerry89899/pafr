package Application;

import Data.DatabaseConnection;
import Data.LocalDB;
import DataRepresentation.Locomotive;
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



    public void NewTrain(String name, RollingComponent locomotive){//
        //
        if (locomotive  instanceof Locomotive) {
            TrainFactory t = new TrainFactory(name, locomotive);
            dbc.AddTrain(t);

        }else{
            //sent error message
        }
    }
    public void DeleteTrain(String trainID){
        boolean done = dbc.DeleteTrain(trainID);
        if (done == false){
            //sent error message
        }
    }
    public void NewRollingComponent(RollingComponentType type, String Name, int seats){

    }
    public void AddRollingComponentToTrain(String trainid, String rollingcomponentid){
        //check dat het geen locomotief is

    }
    public boolean DeleteRollingComponentFromTrain(int trainIndex, int rollingComponentIndex){
        return true;
    }
    public ArrayList<TrainFactory> getTrains(){
        return dbc.GetAllTrains();
    }
    public ArrayList<RollingComponent> getRollingComponents(){
        return dbc.GetAllRollingComponents();
    }








}
