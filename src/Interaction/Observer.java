package Interaction;


import DataRepresentation.RollingComponent;
import DataRepresentation.Train;

import java.util.ArrayList;

public interface Observer {

    public void update(ArrayList<Train> trains, ArrayList<RollingComponent> rollingComponents);

}
