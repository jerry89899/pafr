package Interaction;


import DataRepresentation.RollingComponent;
import DataRepresentation.Train;

import java.util.ArrayList;

public abstract class Observer {
    protected Data data;

    public abstract void update();

}
