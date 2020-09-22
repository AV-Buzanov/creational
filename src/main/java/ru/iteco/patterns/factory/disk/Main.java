package ru.iteco.patterns.factory.disk;

import ru.iteco.patterns.factory.disk.intel.IntelFactory;
import ru.iteco.patterns.factory.disk.samsung.SamsungFactory;
import ru.iteco.patterns.factory.disk.wd.WDFactory;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {

//        DiskFactory diskFactory = new WDFactory();
//        DiskFactory diskFactory = new IntelFactory();
        DiskFactory diskFactory = new SamsungFactory();

        M2 m2 = diskFactory.createM2();

        SSD ssd = diskFactory.createSsd();

        Hard hard = diskFactory.createHard();

    }
}
