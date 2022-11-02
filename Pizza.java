/**This is a class called "Pizza", used to create a new pizza for a customer
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */

import java.util.Random;


public class Pizza
{
    // Attributes
    private final int numSlices = 8;
    private MeatChoice meat_choice;
    private VegChoice veg_Choice;
    public final Random rand_num = new Random();

    // Default constructor
    public Pizza()
    {
        int rand_meat_num = rand_num.nextInt(3);
        int rand_veg_num = rand_num.nextInt(5);
        MeatChoice[] meat = MeatChoice.values();
        VegChoice[] veg = VegChoice.values();
        meat_choice = meat[rand_meat_num];
        veg_Choice = veg[rand_veg_num];
    }

    // Constructor with two argument
    public Pizza( MeatChoice _meat, VegChoice _veg)
    {
        meat_choice = _meat;
        veg_Choice = _veg;
    }

    // Getter Methods
    public int get_NumOfSlices()
    {
        return numSlices;
    }

    public MeatChoice get_Meat_Choice()
    {
        return meat_choice;
    }

    public VegChoice get_Veg_Choice()
    {
        return veg_Choice;
    }


    // Setter Methods
    public void set_Meat_Choice(MeatChoice meat)
    {
        meat_choice = meat;
    }

    public void set_Veg_Choice(VegChoice veg)
    {
        veg_Choice = veg;
    }

    // toString method
    @Override
    public String toString() {
        return "This Pizza has " + numSlices + " Slices, " + "Choice of Meat Topping is " + get_Meat_Choice() +
                " and Choice of Vegetable Topping is " + get_Veg_Choice();
    }
}