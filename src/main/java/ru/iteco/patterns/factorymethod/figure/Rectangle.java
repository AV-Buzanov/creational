package ru.iteco.patterns.factorymethod.figure;

/**
 * Rectange.
 *
 * @author Ilya_Sukhachev
 */
public class Rectangle implements Figure {

    @Override
    public String getPerimeter() {
        return "2 * (sideA + sideB)";
    }
}
