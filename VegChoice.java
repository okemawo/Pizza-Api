public enum VegChoice
{
    // Enum constants and their String linkages
    CARROT("Carrot"),
    LETTUCE("Lettuce"),
    TOMATO("Tomato"),
    ONION("Onion"),
    MUSHROOM("Mushroom");

    // Attributes
    private String _veg;

    // Constructor with one argument
    VegChoice (String veg)
    {
        _veg = veg;
    }

    // Maps String to an Enum constant
    public static VegChoice convertString(String _Value)
    {
        for (VegChoice option : VegChoice.values())
        {
            if (_Value.equalsIgnoreCase(option._veg))
                return option;
        }
        if (_Value.equalsIgnoreCase("ON"))
            return ONION;
        if (_Value.equalsIgnoreCase("CAR"))
            return CARROT;
        if (_Value.equalsIgnoreCase("TM"))
            return LETTUCE;
        if (_Value.equalsIgnoreCase("LET"))
            return LETTUCE;
        if (_Value.equalsIgnoreCase("MSH"))
            return MUSHROOM;
        return ONION;
    }

    // toString method
    public String toString()
    {
        return _veg;
    }
}
