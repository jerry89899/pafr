package DataRepresentation;

public class Demo {

    public static void main(String[] args) {
        Train shapeFactory = new Train();

        //get an object of Circle and call its draw method.
        RollingComponent shape1 = shapeFactory.getShape("Wagon");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        RollingComponent shape2 = shapeFactory.getShape("Locomotive");

        //call draw method of Rectangle
        shape2.draw();
    }
}