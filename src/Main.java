import Category.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Hashtable;

public class Main {
    enum CATEGORY_NAME
    {
        TEMPERATURE,
        LENGTH,
        WEIGHT,
        VOLUME,
    }

    private static Hashtable<CATEGORY_NAME, Category> categoryDictionary;

    public static void main(String[] args) {
        categoryDictionary = new Hashtable<>();
        categoryDictionary.put(CATEGORY_NAME.TEMPERATURE, new Temperature());
        categoryDictionary.put(CATEGORY_NAME.LENGTH, new Length());
        categoryDictionary.put(CATEGORY_NAME.WEIGHT, new Weight());
        categoryDictionary.put(CATEGORY_NAME.VOLUME, new Volume());

        Convert(CATEGORY_NAME.TEMPERATURE, 234, "Celsius", "Fahrenheit");
        Convert(CATEGORY_NAME.LENGTH, 23.5623, "Meter", "Foot");
        Convert(CATEGORY_NAME.WEIGHT, 10.7234, "Pound", "Gram");
        Convert(CATEGORY_NAME.VOLUME, 2234, "Tablespoon", "Liter");
    }

    public static void Convert(CATEGORY_NAME categoryName, double value, String inputUnit, String outputUnit)
    {
        if(categoryDictionary.containsKey(categoryName))
        {
            Category category = categoryDictionary.get(categoryName);

            String inputSign = category.GetSign(inputUnit);
            String outputSign = category.GetSign(outputUnit);

            double outputValue = category.Convert(value, inputUnit, outputUnit);
            BigDecimal bd = new BigDecimal(outputValue);
            bd = bd.setScale(3, RoundingMode.HALF_EVEN);
            outputValue = bd.doubleValue();

            System.out.println(value + " " + inputSign + " = " + outputValue + " " + outputSign);
        }
    }
}