package ru.iteco.patterns.factorymethod.figure;

/**
 * Circle.
 *
 * @author Ilya_Sukhachev
 */
public class Circle implements Figure {

    @Override
    public String getPerimeter() {
        return "2 * Math.PI * radius";
    }
}
