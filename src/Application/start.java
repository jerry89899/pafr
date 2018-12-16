package Application;

import DataRepresentation.RollingComponentType;
import Interaction.ConsoleApplication;
import Interaction.Data;
import Interaction.VisualApplication;

public class start {
    public static void main(String [ ] args){
        //poging voor observer;
//        //create observer data class
//        Data data = new Data();
//        //add observers
//        new ConsoleApplication(data);
//        new VisualApplication(data);
//        //register observers


        TrainService ts = new TrainService();
        ts.NewRollingComponent(RollingComponentType.Locomotive, "Loc1",0);
        ts.NewRollingComponent(RollingComponentType.FirstClassWagon, "First1",10);
        ts.NewRollingComponent(RollingComponentType.SecondClassWagon,"Second1");
        System.out.println(ts.getRollingComponents());
        ts.NewTrain(ts.getRollingComponents().get(0), "test1");
        ts.getTrains().get(0).addWagon(ts.getRollingComponents().get(2));
        System.out.println(ts.getTrains());
        System.out.println(ts.getTrains().get(0).getRollingComponents().get(1).getId());
        ts.NewTrain(ts.getRollingComponents().get(0), "test2");
        System.out.println(ts.getTrains());
    }//
}
