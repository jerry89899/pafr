package DataRepresentation;

public class Train {

    public RollingComponent getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Wagon();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Locomotive();

        }

        return null;
    }

}
