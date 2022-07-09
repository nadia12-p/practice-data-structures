package com.nadiapintos.solid;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return "{shapesSum: %s}".formatted(
                areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "shapes_sum,%s".formatted(
                areaCalculator.sum(shapes));
    }


    /* breaking the rules: open closed and depending on
    the concrete class and not the abstraction
    refactor -> AreaCalculator

    private AreaCalculator areaCalculator
            = new AreaCalculator();


    public String json(List<Shape> shapes) {
        return "{shapesSum: %s}".formatted(
                areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "shapes_sum,%s".formatted(
                areaCalculator.sum(shapes));
    }*/

}
