package System;

import Category.Length;
import Category.Temperature;
import Category.Volume;
import Category.Weight;

public class Imperial extends System{
    public Imperial()
    {
        super();

        temperature = new Temperature().GetUnit("Fahrenheit");
        length = new Length().GetUnit("Inch");
        volume = new Volume().GetUnit("Gallon");
        weight = new Weight().GetUnit("Pound");
    }
}
