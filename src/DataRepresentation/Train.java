package DataRepresentation;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private String id;
    private List<RollingComponent> rollingComponents;

    public Train(String id, RollingComponent locomotive){ // als je loco wilt verwijderen dan word de trein verwijderd.
        this.id = id;
        rollingComponents = new ArrayList<RollingComponent>();
        rollingComponents.add(locomotive);
    }

    public void addWagon(RollingComponent rollingComponent){//check if rollingcomponent is NOT locomotive
        rollingComponents.add(rollingComponent);
    }
    public void removeWagon(RollingComponent r){
        rollingComponents.remove(r);
    }
    public String getId() {
        return id;
    }

    public List<RollingComponent> getRollingComponents() {
        return rollingComponents;
    }

    public int getTotalSeats(){
        int seats = 0;
        for (RollingComponent rc: rollingComponents){
            seats = seats + rc.getSeats();
        }
        return seats;
    }
}





