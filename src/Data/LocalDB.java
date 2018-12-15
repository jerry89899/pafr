package Data;


import java.util.ArrayList;

public class LocalDB implements DatabaseConnection {

   private ArrayList<TrainFactory> trains = new  ArrayList<TrainFactory>();
   private ArrayList<RollingComponent> rollingComponents = new  ArrayList<RollingComponent>();

    public ArrayList<TrainFactory> getAllTrains(){
       return trains;
   }

    public void addTrain(TrainFactory train){
        trains.add(train);
    }

    public boolean deleteTrain(String id){
       TrainFactory train = getTrainById(id);
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



    private TrainFactory getTrainById(String id){
        TrainFactory found = null;
        for (TrainFactory t: trains){
            if (t.getId().equals(id) ){
                found = t;
            }
        }
        return found;
    }

}
