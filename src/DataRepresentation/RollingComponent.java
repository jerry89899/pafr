package DataRepresentation;

public class RollingComponent {
    protected Integer wheels;
    protected String id;
    protected Integer seats;
    protected String image;

    public RollingComponent(String id, Integer wheels, Integer seats, String image) {
        this.id = id;
        this.wheels = wheels;
        this.seats = seats;
        this.image = image;
    }

    public RollingComponent(String id, Integer wheels, String image) {
        this.id = id;
        this.wheels = wheels;
        this.image = image;
    }


    public void setId(String id) {
        this.id = id;
    }



    public Integer getWheels() {
        return this.wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }


    public String getId() { return id; }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}