package Data;


import DataRepresentation.RollingComponent;
import DataRepresentation.Train;

import java.util.ArrayList;

public class LocalDB implements DatabaseConnection {

   private ArrayList<Train> trains = new  ArrayList<Train>();
   private ArrayList<RollingComponent> rollingComponents = new  ArrayList<RollingComponent>();

    public ArrayList<Train> getAllTrains(){
       return trains;
   }

    public void addTrain(Train train){
        trains.add(train);
    }

    public boolean deleteTrain(String id){
       Train train = getTrainById(id);
       if (train != null) {
           trains.remove(train);
           return true;
       }
       else{
           return false;
       }

   }
    public ArrayList<RollingComponent> getAllRollingComponents() {
        return rollingComponents;
    }

    public void addRollingComponent(RollingComponent rollingComponent){
        rollingComponents.add(rollingComponent);
    }



    private Train getTrainById(String id){
        Train found = null;
        for (Train t: trains){
            if (t.getId().equals(id) ){
                found = t;
            }
        }
        return found;
    }

}
