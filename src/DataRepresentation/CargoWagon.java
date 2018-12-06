package DataRepresentation;

public class CargoWagon implements RollingComponent {

    protected String image;

    public CargoWagon(String id, String image){
        this.image = image;
    }


    @Override
    public void draw() {
        System.out.println("Inside CargoWagon::draw() method.");
    }
}
