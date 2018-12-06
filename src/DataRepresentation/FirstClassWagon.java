package DataRepresentation;

public class FirstClassWagon implements RollingComponent {
    protected String image;

    public FirstClassWagon(String id, String image){
        this.image = image;
    }

    @Override
    public void draw() {
        System.out.println("Inside FirstClassWagon::draw() method.");
    }
}
