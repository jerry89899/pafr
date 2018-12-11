package DataRepresentation;

public class Demo {

    public static void main(String[] args) {
        TrainFactory shapeFactory = new TrainFactory();

        //get an object of Circle and call its draw method.
        RollingComponent cargowag = shapeFactory.getTrainPart("Cargo", "cargo");

        //call draw method of Circle
        cargowag.draw();

        //get an object of Circle and call its draw method.
        RollingComponent firstclasswag = shapeFactory.getTrainPart("FirstClass", "first");

        //call draw method of Circle
        firstclasswag.draw();

        //get an object of Circle and call its draw method.
        RollingComponent secondclasswag = shapeFactory.getTrainPart("SecondClass","sec");

        //call draw method of Circle
        secondclasswag.draw();

        //get an object of Rectangle and call its draw method.
        RollingComponent shape2 = shapeFactory.getTrainPart("Locomotive", "loco");

        //call draw method of Rectangle
        shape2.draw();
    }
}