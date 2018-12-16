package Data;


import DataRepresentation.RollingComponent;
import DataRepresentation.Train;
import Interaction.ConsoleApplication;
import Interaction.Data;

import java.util.ArrayList;

public class LocalDB extends Data implements DatabaseConnection {
    private ArrayList<Train> trains = new  ArrayList<Train>();
   private ArrayList<RollingComponent> rollingComponents = new  ArrayList<RollingComponent>();

    public ArrayList<Train> getAllTrains(){
       return trains;
   }

    public void addTrain(Train train){
        trains.add(train);
        updateTrains(trains);
    }

    public void deleteTrain(Train train){
       trains.remove(train);
       updateTrains(trains);
   }

   public void saveTrain(Train train){
        String id = train.getId();
        deleteTrain(getTrainById(id));
        trains.add(train);
        updateTrains(trains);
   }

    public ArrayList<RollingComponent> getAllRollingComponents() {
        return rollingComponents;
    }

    public void addRollingComponent(RollingComponent rollingComponent){
        rollingComponents.add(rollingComponent);
        updateRollingComponents(rollingComponents);
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
