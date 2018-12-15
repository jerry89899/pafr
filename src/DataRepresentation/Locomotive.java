package DataRepresentation;

import java.util.ArrayList;

public class Locomotive extends RollingComponent{
    private String id;
    private int seats;
    Locomotive(String id, int seats){
        super(RollingComponentType.Locomotive);
        this.id = id;
        this.seats = seats;
    }

    Locomotive(String id){
        super(RollingComponentType.Locomotive);
        this.id = id;
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public String getId() {
        return id;
    }
}
