package Category;

import Unit.Unit;

import java.util.Hashtable;

public class Category {
    protected Unit controlUnit;
    protected Hashtable<String, Unit> unitDictionary;

    public Category()
    {
        controlUnit = new Unit("-None-", 1, 0);
        unitDictionary = new Hashtable<>();
    }

    public Unit GetUnit(String name)
    {
        if(unitDictionary.containsKey(name))
            return unitDictionary.get(name);
        return null;
    }

    public double Convert(double value, String inputUnit, String outputUnit)
    {
        if(unitDictionary.containsKey(inputUnit) && unitDictionary.containsKey(outputUnit))
        {
            Unit input = unitDictionary.get(inputUnit);
            if(input != controlUnit)
                value = input.ConvertToControl(value);

            Unit output = unitDictionary.get(outputUnit);
            return output.Convert(value);
        }
        return value;
    }
}
