package DataRepresentation;

public class Wagon implements RollingComponent {

    private String type;

    @Override
    public void draw() {
        System.out.println("Inside Wagon::draw() method.");
    }
}
