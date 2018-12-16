package DataRepresentation;

public abstract class RollingComponent {

    public  RollingComponent (RollingComponentType type){
        this.type = type;
    }

    public abstract int getSeats();
    public abstract String getId();

    private RollingComponentType type = null;

    public RollingComponentType getType(){
        return type;
    }

}