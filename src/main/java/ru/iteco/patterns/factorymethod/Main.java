package ru.iteco.patterns.factorymethod;

import ru.iteco.patterns.factorymethod.car.AbstractCar;
import ru.iteco.patterns.factorymethod.car.BMW;
import ru.iteco.patterns.factorymethod.car.CarFactory;
import ru.iteco.patterns.factorymethod.car.Lada;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
//        Lada lada = new Lada();

//        AbstractCar[] cars = { new Lada(), new BMW()};
        AbstractCar[] cars = { CarFactory.createCar("Lada"),
                CarFactory.createCar("") };
        for (AbstractCar car : cars) {
            car.crash(null);
        }
    }
}
