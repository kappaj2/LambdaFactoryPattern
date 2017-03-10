package za.co.ajk.lambdas.factorypattern;

import java.util.function.Supplier;

public class TestLambdaFactory {

    public static void main(String[] args) {

        Supplier<LambdaShapeFactory> factory = LambdaShapeFactory::new;

        factory.get().getShape(SHAPE_TYPE.CIRCLE).draw();

        factory.get().getShape(SHAPE_TYPE.RECTANGLE).draw();
    }
}
