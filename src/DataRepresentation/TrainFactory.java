package DataRepresentation;

import java.util.ArrayList;

public class TrainFactory {

    private static ArrayList<RollingComponent> rollingComponents;

    public TrainFactory() {
    }

    static {
        TrainFactory.rollingComponents = new ArrayList<>();
    }

    public RollingComponent getTrainPart(String rollingComponentType, String id) {
        RollingComponent trainpart = null;
        switch (rollingComponentType) {
            case "Cargo":
                trainpart = new CargoWagon(id, "../res/wg3.png");
                break;

            case "FirstClass":
                trainpart = new FirstClassWagon(id, "../res/wg2.png");
                break;

            case "SecondClass":
                trainpart = new SecondClassWagon(id, "../res/wg1.png");
                break;

            case "Locomotive":
                trainpart = new Locomotive(id, "../res/train.png");
                break;
        }
        rollingComponents.add(trainpart);
        return trainpart;
    }
    public static ArrayList<RollingComponent> getRollingComponents(){return rollingComponents;
    }

}





