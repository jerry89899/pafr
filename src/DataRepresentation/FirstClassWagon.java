package DataRepresentation;

public class FirstClassWagon extends RollingComponent implements Pullable {

    private Locomotive pulledBy;

    public FirstClassWagon(String id, Integer wheels, String image) {
        super(id, wheels, image);
    }


    @Override
    public Locomotive getPulledBy() {
        return pulledBy;
    }

    @Override
    public void setPulledby(Pullable locomotive) {
    }

    @Override
    public String toString() {
        return "FirstClassWagon";
    }
}