package net.java.main.factories;

import net.java.main.comparators.UnitComparatorByHealthPoints;
import net.java.main.comparators.UnitComparatorByName;

public final class UnitComparatorFactory {
    private UnitComparatorFactory() {
    }

    public static UnitComparatorByHealthPoints createComparatorByHealthPoints(){
        return new UnitComparatorByHealthPoints();
    }

    public static UnitComparatorByName createComparatorByName(){
        return new UnitComparatorByName();
    }
}
