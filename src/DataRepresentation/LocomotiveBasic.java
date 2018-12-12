package DataRepresentation;

import java.util.ArrayList;

public class LocomotiveBasic extends RollingComponent implements Locomotive{

    private ArrayList<Pullable> components;

    public LocomotiveBasic(String id, Integer wheels, String image){
        super(id, wheels, image);
        components = new ArrayList<>();
    }


    @Override
    public void addVehicle(Pullable component) {
        if(!components.contains(component))
            components.add(component);
    }

    @Override
    public void removeVehicle(Pullable component) {
        components.remove(component);
    }

    @Override
    public ArrayList<Pullable> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Train";
    }
}
