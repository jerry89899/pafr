package DataRepresentation;

public class SecondClassWagon implements RollingComponent {

    protected String image;

    public SecondClassWagon(String id, String image){
        this.image = image;
    }

    @Override
    public void draw() {
        System.out.println("Inside SecondClassWagon::draw() method.");
    }
}
