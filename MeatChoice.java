public enum MeatChoice
{
    // Enum constants and their String linkages
    CHICKEN("Chicken"),
    PORK("Pork"),
    BEEF("Beef");

    // Attributes
    private String _meat;

    // Constructor with one argument
    MeatChoice (String meat)
    {
        _meat = meat;
    }

    // Maps String to an Enum constant
    public static MeatChoice convertString(String _Value)
    {
        for (MeatChoice option : MeatChoice.values())
        {
            if (_Value.equalsIgnoreCase(option._meat))
                return option;
        }
        if (_Value.equalsIgnoreCase("CHK"))
            return CHICKEN;
        if (_Value.equalsIgnoreCase("chick"))
            return CHICKEN;
        if (_Value.equalsIgnoreCase("pk"))
            return PORK;
        if (_Value.equalsIgnoreCase("bf"))
            return BEEF;
        if (_Value.equalsIgnoreCase("bef"))
            return BEEF;
        return BEEF;
    }

    // toString method
    public String toString()
    {
        return _meat;
    }
}
