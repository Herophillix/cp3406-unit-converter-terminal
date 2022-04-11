package Unit;

public class Unit {
    private String sign;
    private double multiplier;
    private double adder;

    public Unit(String sign, double multiplier, double adder)
    {
        this.sign = sign;
        this.multiplier = multiplier;
        this.adder = adder;
    }

    public String GetSign()
    {
        return sign;
    }

    public double Convert(double value)
    {
        return value * multiplier + adder;
    }

    public double ConvertToControl(double value)
    {
        return (value - adder) / multiplier;
    }
}