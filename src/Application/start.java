package Application;

import DataRepresentation.RollingComponentType;

public class start {
    public static void main(String [ ] args){
        TrainService ts = new TrainService();
        ts.NewRollingComponent(RollingComponentType.Locomotive, "Loc1",0);
        ts.NewRollingComponent(RollingComponentType.FirstClassWagon, "First1",10);
        ts.NewRollingComponent(RollingComponentType.SecondClassWagon,"Second1");
        System.out.println(ts.getRollingComponents());
        ts.NewTrain(ts.getRollingComponents().get(0), "test1");
        ts.getTrains().get(0).addWagon(ts.getRollingComponents().get(2));
        System.out.println(ts.getTrains());
        System.out.println(ts.getTrains().get(0).getRollingComponents());
        ts.NewTrain(ts.getRollingComponents().get(0), "test2");
        //        ts.NewTrain();
    }
}
