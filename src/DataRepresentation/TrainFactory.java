package DataRepresentation;

public class TrainFactory {

    public RollingComponent getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Wagon")){
            return new Wagon();

        } else if(shapeType.equalsIgnoreCase("Locomotive")){
            return new Locomotive();

        }

        return null;
    }

}