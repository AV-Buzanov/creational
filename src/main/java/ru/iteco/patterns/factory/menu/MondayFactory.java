package ru.iteco.patterns.factory.menu;

/**
 * MondayFactory.
 *
 * @author Ilya_Sukhachev
 */
public class MondayFactory implements LunchFactory {

    public HotDish createHotDish() {
        return new Puree();
    }

    public Dessert createDessert() {
        return new Muffin();
    }
}
