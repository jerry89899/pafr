package DataRepresentation;

import java.util.ArrayList;

public class TrainFactory {

    private static ArrayList<RollingComponent> components;

    public TrainFactory() {
    }

    static {
        TrainFactory.components = new ArrayList<>();
    }

    public RollingComponent getTrainPart(String rollingComponentType, Integer wheels, String id) {
        RollingComponent trainpart = null;
        switch (rollingComponentType) {
            case "Cargo":
                trainpart = new CargoWagon(id, wheels, "../res/wg3.png");
                break;

            case "FirstClass":
                trainpart = new FirstClassWagon(id, wheels, "../res/wg2.png");
                break;

            case "SecondClass":
                trainpart = new SecondClassWagon(id, wheels, "../res/wg1.png");
                break;

            case "LocomotiveBasic":
                trainpart = new LocomotiveBasic(id, wheels, "../res/train.png");
                break;
        }
        components.add(trainpart);
        return trainpart;
    }
    public static ArrayList<RollingComponent> getPullables(){return components;
    }

}





