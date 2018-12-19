package DataRepresentation;

public class CargoWagon extends RollingComponent {

    CargoWagon(String id, int seats){
        super(RollingComponentType.CargoWagon);
        this.id = id;
        this.seats = seats;
    }
    CargoWagon(String id){
        super(RollingComponentType.FirstClassWagon);
        this.id = id;
        this.seats = 20;
    }

    public int getSeats() {
        return seats;
    }

    public String getId() {
        return id;
    }

    public String getImage(){
        return "../res/wg3.png";
    }

}