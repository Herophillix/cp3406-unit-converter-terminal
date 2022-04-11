package System;

import Category.Length;
import Category.Temperature;
import Category.Volume;
import Category.Weight;

public class Metric extends System{
    public Metric()
    {
        super();

        temperature = new Temperature().GetUnit("Kelvin");
        length = new Length().GetUnit("Meter");
        volume = new Volume().GetUnit("Cubic Meter");
        weight = new Weight().GetUnit("Kilogram");
    }
}
