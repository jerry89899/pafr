package Data;


import DataRepresentation.RollingComponent;
import DataRepresentation.TrainFactory;

import java.util.ArrayList;

public class LocalDB implements DatabaseConnection {

   private ArrayList<TrainFactory> trains = new  ArrayList<TrainFactory>();
   private ArrayList<RollingComponent> rollingComponents = new  ArrayList<RollingComponent>();

    public ArrayList<TrainFactory> GetAllTrains(){
       return trains;
   }
    public void AddTrain(TrainFactory train){
        trains.add(train);
    }
    public void DeleteTrain(int trainIndex){
       trains.remove(trainIndex);
   }
    public ArrayList<RollingComponent> GetAllRollingComponents(){
        return rollingComponents;
    }
    public void AddTrain(RollingComponent rollingComponent){
        rollingComponents.add(rollingComponent);
    }
}
