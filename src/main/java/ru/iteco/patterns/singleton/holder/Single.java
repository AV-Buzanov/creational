package ru.iteco.patterns.singleton.holder;

import java.util.concurrent.locks.LockSupport;

/**
 * Single.
 * + Ленивая инициализация
 * + Высокая производительность
 * - Невозможно использовать для не статических полей класса
 * @author Ilya_Sukhachev
 */
public class Single {

    private Single() {
    }

    static class Holder {
        public static Single instance = new Single();
    }

    public static Single getInstance() {
        return Holder.instance;
    }
}
