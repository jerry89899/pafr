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

    public void deleteTrain(Train train){
       trains.remove(train);
   }

   public void saveTrain(Train train){
        String id = train.getId();
        deleteTrain(getTrainById(id));
        trains.add(train);
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
