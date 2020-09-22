package ru.iteco.patterns.factory.menu;

/**
 * TuesdayFactory.
 *
 * @author Ilya_Sukhachev
 */
public class TuesdayFactory implements LunchFactory {
    @Override
    public HotDish createHotDish() {
        return new Pasta();
    }

    @Override
    public Dessert createDessert() {
        return new IceCream();
    }
}
