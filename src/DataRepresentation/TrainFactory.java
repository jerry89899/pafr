package DataRepresentation;

import java.util.ArrayList;

public class TrainFactory {

    private String id;

    public TrainFactory(String id, RollingComponent locomotive){ // als je loco wilt verwijderen dan word de trein verwijderd.
        ArrayList<RollingComponent> rollingComponents = new ArrayList<RollingComponent>();
        rollingComponents.add(locomotive);
        this.id = id;
//        add locomotive to arraylist


    }

    public String getId() {
        return id;
    }
}





