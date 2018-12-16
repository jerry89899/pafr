package Application;

import Data.DatabaseConnection;
import Data.LocalDB;
import DataRepresentation.*;
import Interaction.ConsoleApplication;
import Interaction.Data;

import java.util.ArrayList;

public class TrainService implements TrainRepositoryInterface, TrainServiceInterface {



    //create database connection
    DatabaseConnection dbc = new LocalDB();

    //create observer data class
    Data data = new Data();
    //add observers
    ConsoleApplication consoleApplication = new ConsoleApplication();
    //register observers
    data.



    public void NewTrain(RollingComponent locomotive, String id){//
        //
        if (locomotive  instanceof Locomotive) {
            Train t = new Train(id, locomotive);
            dbc.addTrain(t);

        }else{
            //sent error message

        }
    }
    public void DeleteTrain(Train train){
        dbc.deleteTrain(train);
    }
    public void NewRollingComponent(RollingComponentType type, String name, int seats){
        RollingComponent r =  RollingComponentFactory.buildRC(type,name,seats);
        dbc.addRollingComponent(r);
    }
    public void NewRollingComponent(RollingComponentType type, String name){
        RollingComponent r =  RollingComponentFactory.buildRC(type,name);
        dbc.addRollingComponent(r);
    }
    public void AddRollingComponentToTrain(Train train, RollingComponent rollingcomponent){
        //check dat het geen locomotief is
        train.addWagon(rollingcomponent);
        dbc.saveTrain(train);
    }
    public boolean DeleteRollingComponentFromTrain(Train train, RollingComponent rollingComponent) {
        if (rollingComponent instanceof Locomotive) {
            //error
            return false;
        } else {
            train.removeWagon(rollingComponent);
            dbc.saveTrain(train);
            return true;
        }
    }
    public ArrayList<Train> getTrains(){
        return dbc.getAllTrains();
    }
    public ArrayList<RollingComponent> getRollingComponents(){
        return dbc.getAllRollingComponents();
    }








}
