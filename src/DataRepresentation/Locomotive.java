package DataRepresentation;

public class Locomotive extends RollingComponent {
    Locomotive(String id, int seats){
        super(RollingComponentType.Locomotive);
        this.id = id;
        this.seats = seats;
    }

    Locomotive(String id){
        super(RollingComponentType.Locomotive);
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
        return "../res/train.png";
    }
}
