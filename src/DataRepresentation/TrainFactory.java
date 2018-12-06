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
                trainpart = new CargoWagon();
                break;

            case "FirstClass":
                trainpart = new FirstClassWagon();
                break;

            case "SecondClass":
                trainpart = new SecondClassWagon();
                break;
        }
        rollingComponents.add(trainpart);
        return trainpart;
    }
    public static ArrayList<RollingComponent> getRollingComponents(){return rollingComponents;
    }

}





