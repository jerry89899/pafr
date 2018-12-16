package Application;

import DataRepresentation.RollingComponentType;

public class start {
    public static void main(String [ ] args){
        //poging voor observer;
//        //create observer data class
//        Data data = new Data();
//        //add observers
//        new ConsoleApplication(data);
//        new VisualApplication(data);
//        //register observers

        //connect to trainservice
        TrainService ts = new TrainService();
        //create rolling components
        ts.NewRollingComponent(RollingComponentType.Locomotive, "Loc1",0);
        ts.NewRollingComponent(RollingComponentType.FirstClassWagon, "First1",10);
        ts.NewRollingComponent(RollingComponentType.SecondClassWagon,"Second1");
        //print rollingcompontents
        System.out.println(ts.getRollingComponents());
        //create new train
        ts.NewTrain(ts.getRollingComponents().get(0), "test1");
        //add wagon to train
        ts.getTrains().get(0).addWagon(ts.getRollingComponents().get(2));
        //print trains
        System.out.println(ts.getTrains());
        //get id of rollingcomponent 2
        System.out.println(ts.getTrains().get(0).getRollingComponents().get(1).getId());
        //make new train
        ts.NewTrain(ts.getRollingComponents().get(0), "test2");

        System.out.println(ts.getTrains());
    }//
}
