package DataRepresentation;

public class Locomotive implements RollingComponent{

    protected String image;
    protected String id;

    public Locomotive(String id, String image){
        this.image = image;
        this.id = id;
    }


    @Override
    public void draw() {
        System.out.println("id = " + this.id + "\n" + this.image);
    }
}
