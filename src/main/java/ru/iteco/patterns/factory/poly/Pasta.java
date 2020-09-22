package ru.iteco.patterns.factory.poly;

/**
 * Pasta.
 *
 * @author Ilya_Sukhachev
 */
public class Pasta implements HotDish {
    @Override
    public String getName() {
        return "Макароны по-флотски";
    }
}
