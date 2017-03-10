package za.co.ajk.lambdas.factorypattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Shape factory using lambda function interface.
 */
public class LambdaShapeFactory {

    private final static Map<SHAPE_TYPE, Supplier<Shape>> map = new HashMap<>();

    static{
        map.put(SHAPE_TYPE.CIRCLE, Circle::new);
        map.put(SHAPE_TYPE.RECTANGLE, Rectangle::new);
    }

    public Shape getShape(SHAPE_TYPE shapeType){
        Supplier<Shape> shape = map.get(shapeType);
        if(shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("Unkown shape type");
    }
}
