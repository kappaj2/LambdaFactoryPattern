package za.co.ajk.lambdas.factorypattern;

/**
 * Test the old factory pattern.
 */
public class TestOldFactory {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        /*
            Build circle
         */
        Shape circleShape = factory.getShape(SHAPE_TYPE.CIRCLE);
        circleShape.draw();

        /*
            Build rectangle
         */

        Shape rectangleShape = factory.getShape(SHAPE_TYPE.RECTANGLE);
        rectangleShape.draw();
    }
}
