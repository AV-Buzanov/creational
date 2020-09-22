package ru.iteco.patterns.factory.disk.intel;

import ru.iteco.patterns.factory.disk.DiskFactory;
import ru.iteco.patterns.factory.disk.Hard;
import ru.iteco.patterns.factory.disk.M2;
import ru.iteco.patterns.factory.disk.SSD;

/**
 * WDFactory.
 *
 * @author Ilya_Sukhachev
 */
public class IntelFactory implements DiskFactory {
    @Override
    public Hard createHard() {
        return new IntelHard();
    }

    @Override
    public SSD createSsd() {
        return new IntelSSD();
    }

    @Override
    public M2 createM2() {
        return new IntelM2();
    }
}
