package DataRepresentation;

public class SecondClassWagon extends RollingComponent {
    private String id;
    private int seats;

    SecondClassWagon(String id, int seats) {
        super(RollingComponentType.SecondClassWagon);
        this.id = id;
        this.seats = seats;
    }
    SecondClassWagon(String id) {
        super(RollingComponentType.SecondClassWagon);
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
        return "../res/wg1.png";
    }
}

