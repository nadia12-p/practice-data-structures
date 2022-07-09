package com.nadiapintos.solid;

public interface Shape {
    double area();
    //double volume(); -> breaks the rule because for example,
    //you're telling some classes to do things they can't do
}
