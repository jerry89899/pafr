package DataRepresentation;

public class Demo {

    public static void main(String[] args) {
        TrainFactory shapeFactory = new TrainFactory();

        //get an object of Circle and call its draw method.
        RollingComponent cargowag = shapeFactory.getWagon("Cargo");

        //call draw method of Circle
        cargowag.draw();

        //get an object of Circle and call its draw method.
        RollingComponent firstclasswag = shapeFactory.getWagon("FirstClass");

        //call draw method of Circle
        firstclasswag.draw();

        //get an object of Circle and call its draw method.
        RollingComponent secondclasswag = shapeFactory.getWagon("SecondClass");

        //call draw method of Circle
        secondclasswag.draw();

        //get an object of Rectangle and call its draw method.
        RollingComponent shape2 = shapeFactory.getLocomotive("Locomotive");

        //call draw method of Rectangle
        shape2.draw();
    }
}