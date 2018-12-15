package Application;

import Data.DatabaseConnection;
import Data.LocalDB;
import DataRepresentation.Locomotive;
import DataRepresentation.RollingComponent;
import DataRepresentation.RollingComponentType;
import DataRepresentation.Train;

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
            Train t = new Train(name, locomotive);
            dbc.addTrain(t);

        }else{
            //sent error message
        }
    }
    public void DeleteTrain(String trainID){
        boolean done = dbc.deleteTrain(trainID);
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
    public ArrayList<Train> getTrains(){
        return dbc.getAllTrains();
    }
    public ArrayList<RollingComponent> getRollingComponents(){
        return dbc.getAllRollingComponents();
    }








}
