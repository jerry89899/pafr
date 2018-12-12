package DataRepresentation;

import java.util.ArrayList;

public interface Locomotive {

    void addVehicle(Pullable component);

    void removeVehicle(Pullable component);

    ArrayList<Pullable> getComponents();
}
