package ru.iteco.patterns.factory.disk.samsung;

import ru.iteco.patterns.factory.disk.DiskFactory;
import ru.iteco.patterns.factory.disk.Hard;
import ru.iteco.patterns.factory.disk.M2;
import ru.iteco.patterns.factory.disk.SSD;

/**
 * SamsungFactory.
 *
 * @author Ilya_Sukhachev
 */
public class SamsungFactory implements DiskFactory {
    @Override
    public Hard createHard() {
        return new SamsungHard();
    }

    @Override
    public SSD createSsd() {
        return new SamsungSSD();
    }

    @Override
    public M2 createM2() {
        return new SamsungM2();
    }
}
