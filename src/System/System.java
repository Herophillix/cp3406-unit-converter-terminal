package System;

import Unit.Unit;

import java.util.ArrayList;

public class System {
    protected Unit temperature;
    protected Unit length;
    protected Unit volume;
    protected Unit weight;

    public System()
    {
        temperature = new Unit("-None-", 1, 0);
        length = new Unit("-None-", 1, 0);
        volume = new Unit("-None-", 1, 0);
        weight = new Unit("-None-", 1, 0);
    }
}
