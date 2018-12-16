package DataRepresentation;

public abstract class RollingComponent {

    public  RollingComponent (RollingComponentType type){
        this.type = type;
    }
    protected String id;
    protected int seats;

    public abstract int getSeats();
    public abstract String getId();
    public abstract String getImage();

    private RollingComponentType type = null;

    public RollingComponentType getType(){
        return type;
    }



}