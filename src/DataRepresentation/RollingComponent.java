package DataRepresentation;

public abstract class RollingComponent {

    public  RollingComponent(RollingComponentType type){
        this.type = type;

    }

    private RollingComponentType type = null;

    private RollingComponentType getType(){
        return type;
    }

}