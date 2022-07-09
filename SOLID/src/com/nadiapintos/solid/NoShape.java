package com.nadiapintos.solid;

public class NoShape implements Shape{
    @Override
    public double area() {
        throw new IllegalStateException(
                "Cannot calculate area");
    }
    /* we broke the rule Liskov substitution
    * because NoShape can't calculate area
    * can't obey the contract of the Shape interface
    * */
}
