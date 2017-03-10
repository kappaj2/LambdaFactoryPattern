package za.co.ajk.lambdas.factorypattern;

/**
 * Factory class to return an instance of a specific shape.
 */
public class ShapeFactory {

    public Shape getShape(SHAPE_TYPE shapeType) {

        if (shapeType == null) {
            return null;
        }

        switch (shapeType) {
            case CIRCLE:
                return new Rectangle();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }

    }

}
