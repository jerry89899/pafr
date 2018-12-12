package DataRepresentation;

public class CargoWagon extends RollingComponent implements Pullable {

    private Locomotive pulledBy;
    protected String image;

    public CargoWagon(String id, Integer wheels, String image){
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
        return "Cargowagon";
    }
}
