package ru.iteco.patterns.factory.menu;

/**
 * IceCream.
 *
 * @author Ilya_Sukhachev
 */
public class IceCream implements Dessert {
    @Override
    public String getName() {
        return "Мороженое";
    }
}
