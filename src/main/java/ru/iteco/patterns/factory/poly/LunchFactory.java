package ru.iteco.patterns.factory.poly;

/**
 * ILunchFactory.
 *
 * @author Ilya_Sukhachev
 */
public interface LunchFactory {

    HotDish createHotDish();

    Dessert createDessert();

    Menu getMenu();
}
