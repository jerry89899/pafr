package Application;

import Data.DatabaseConnection;
import Data.LocalDB;
import DataRepresentation.*;

import java.util.ArrayList;
import java.util.Observable;


public class TrainService extends Observable implements TrainServiceInterface {



    //create database connection
    DatabaseConnection dbc = new LocalDB();



     public void newTrain(RollingComponent locomotive, String id){//
         ArrayList<Train> trains= dbc.getAllTrains();
         for(Train t: trains){
             if(t.getId().equals(id)){
//                 throw new IllegalArgumentException("name allready used by a train");
             }
         }
        if (locomotive  instanceof Locomotive) {
            Train t = new Train(id, locomotive);
            dbc.addTrain(t);
            setChanged();
            notifyObservers();

        }else{
//            throw new IllegalArgumentException("train has to be created with a locomotive");
        }
    }
    public void deleteTrain(Train train){
        dbc.deleteTrain(train);
    }

    public void newRollingComponent(RollingComponentType type, String id, int seats){
        ArrayList<RollingComponent> rollingComponents = dbc.getAllRollingComponents();
        for(RollingComponent r: rollingComponents){
            if(r.getId().equals(id)){
//                throw new IllegalArgumentException("name allready used by a rolling component");

            }
        }
        RollingComponent r =  RollingComponentFactory.buildRC(type,id,seats);
        dbc.addRollingComponent(r);
        setChanged();
        notifyObservers();
    }
    public void newRollingComponent(RollingComponentType type, String name){
        RollingComponent r =  RollingComponentFactory.buildRC(type,name);
        dbc.addRollingComponent(r);
        setChanged();
        notifyObservers();
    }
    public void addRollingComponentToTrain(Train train, RollingComponent rollingComponent) {
        //check dat het geen locomotief is
        if (rollingComponent instanceof Locomotive) {
            //error
//            throw new IllegalArgumentException("can not add locomotive to train");
        } else {
            train.addWagon(rollingComponent);
            dbc.saveTrain(train);
            setChanged();
            notifyObservers();

        }

    }
    public void deleteRollingComponentFromTrain(Train train, RollingComponent rollingComponent) {

         if (rollingComponent instanceof Locomotive) {
            //error
//            throw new IllegalArgumentException("can not delete locomotive of train");
        } else {
            train.removeWagon(rollingComponent);
            dbc.saveTrain(train);
            setChanged();
            notifyObservers();
        }
    }
    public void deleteRollingComponent(RollingComponent rollingComponent){
         for(Train t:dbc.getAllTrains()){
             if(t.getRollingComponents().contains(rollingComponent)){
//                 throw new IllegalArgumentException("Can not delete rollingcomponent because it is in use");

             }
         }
         deleteRollingComponent(rollingComponent);
         setChanged();
         notifyObservers();
    }
    public ArrayList<Train> getTrains(){
        return dbc.getAllTrains();
    }
    public ArrayList<RollingComponent> getRollingComponents(){
        return dbc.getAllRollingComponents();
    }



}
