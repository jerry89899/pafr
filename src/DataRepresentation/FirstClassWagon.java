package DataRepresentation;

public class FirstClassWagon extends RollingComponent {
    FirstClassWagon(String id, int seats){
        super(RollingComponentType.FirstClassWagon);
        this.id = id;
        this.seats = seats;
    }

    FirstClassWagon(String id){
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
        return "../res/wg2.png";
    }
}