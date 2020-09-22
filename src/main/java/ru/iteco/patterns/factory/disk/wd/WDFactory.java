package ru.iteco.patterns.factory.disk.wd;

import ru.iteco.patterns.factory.disk.DiskFactory;
import ru.iteco.patterns.factory.disk.Hard;
import ru.iteco.patterns.factory.disk.M2;
import ru.iteco.patterns.factory.disk.SSD;

/**
 * WDFactory.
 *
 * @author Ilya_Sukhachev
 */
public class WDFactory implements DiskFactory {
    @Override
    public Hard createHard() {
        return new WDHard();
    }

    @Override
    public SSD createSsd() {
        return new WDSSD();
    }

    @Override
    public M2 createM2() {
        return new WDM2();
    }
}
