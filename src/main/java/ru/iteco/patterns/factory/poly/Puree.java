package ru.iteco.patterns.factory.poly;

/**
 * Puree.
 *
 * @author Ilya_Sukhachev
 */
public class Puree implements HotDish {
    @Override
    public String getName() {
        return "Пюре с сосиской";
    }
}
