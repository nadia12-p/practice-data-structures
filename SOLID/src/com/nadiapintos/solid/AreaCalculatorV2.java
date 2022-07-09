package com.nadiapintos.solid;

import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {
    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for(int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).area();

            /*if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
            Breaks the open closed principle,
            have to modify class for every new shape added

            if (shape instanceof Cube) {

            }*/
        }
        return sum;
    }

    /* If we add another method to this class we're breaking the single responsibility
    principle, add this method in a new class, for classes to not be filled with
    excessive functionality

    public String json(List<Object> shapes) {
        return "{sum: %s}".formatted(sum(shapes));
    }*/

}
