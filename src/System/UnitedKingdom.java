package System;

import Category.Length;
import Category.Temperature;
import Category.Volume;
import Category.Weight;

public class UnitedKingdom extends System {
    public UnitedKingdom()
    {
        super();

        temperature = new Temperature().GetUnit("Celsius");;
        length = new Length().GetUnit("Meter");
        volume = new Volume().GetUnit("Milliliter");
        weight = new Weight().GetUnit("Gram");
    }
}
