package System;

import Category.Length;
import Category.Temperature;
import Category.Volume;
import Category.Weight;

public class UnitedStates extends System{
    public UnitedStates()
    {
        super();

        temperature = new Temperature().GetUnit("Fahrenheit");;
        length = new Length().GetUnit("Inch");
        volume = new Volume().GetUnit("Cup");
        weight = new Weight().GetUnit("Pound");
    }
}
