package DataRepresentation;

public class FirstClassWagon extends RollingComponent {
    private String id;
    private int seats;
    FirstClassWagon(String id, int seats){
        super(RollingComponentType.FirstClassWagon);
        this.id = id;
        this.seats = seats;
    }

    FirstClassWagon(String id){
        super(RollingComponentType.FirstClassWagon);
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