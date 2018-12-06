package DataRepresentation;

public class Locomotive implements RollingComponent{

    protected String image;

    public Locomotive(String id, String image){
        this.image = image;
    }


    @Override
    public void draw() {
        System.out.println("Inside Locomotive::draw() method.");
    }
}
