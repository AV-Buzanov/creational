package ru.iteco.patterns.factory.menu;

/**
 * ILunchFactory.
 *
 * @author Ilya_Sukhachev
 */
public interface LunchFactory {
    HotDish createHotDish();
    Dessert createDessert();
}
