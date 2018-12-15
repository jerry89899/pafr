package DataRepresentation;

public class CargoWagon extends RollingComponent{
    private String id;
    private int seats;
    CargoWagon(String id, int seats){
        super(RollingComponentType.CargoWagon);
        this.id = id;
        this.seats = seats;
    }
    CargoWagon(String id){
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