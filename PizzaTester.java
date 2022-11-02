/**This is a program called PizzaTester used to create new pizzas from the Pizza class
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class PizzaTester
{
    public static void main(String agrs[]) throws IOException
    {
        // Attributes
        String no_of_pizza;
        int N;
        String meat;
        String veg;
        ArrayList<Pizza> pizzas;

        // For reading input
        BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));

        Pizza piz = new Pizza(); // Create a new random pizza

        no_of_pizza = agrs[0];
        N = Integer.parseInt(no_of_pizza); // number of arguments passed

        // Terminal interactions
        System.out.println("\nWELCOME TO OKEY'S PASTRIES");
        System.out.println("\nA FREE!!!! Random Pizza Has Been Created For Your Consumption:");
        System.out.println("\nMeat-Topping: " + piz.get_Meat_Choice() + "\nVegetable Toppin: " + piz.get_Veg_Choice()
                            + "\nNumber Of Slices: " + piz.get_NumOfSlices());
        System.out.print("\nWe will proceed with your order of "+ N + " Pizzas\n");

        // Arraylist to store all pizzas ordered
        pizzas = new ArrayList<>();

        for(int x = 1; x <= N; x++) {

            // Terminal interactions
            System.out.println("\n++CREATING PIZZA " + x + ":");
            System.out.print("Enter A Meat Choice (PORK, CHICKEN, BEEF): ");

            // Store meat option and map it to a MeatChoice
            meat = user_input.readLine(); // read input
            MeatChoice _meat = MeatChoice.convertString(meat);

            System.out.print("Enter A Vegetable Choice (CARROT, ONION, LETTUCE, TOMATO, ONION): ");

            // Store vegetable option and map it to a VegChoice
            veg = user_input.readLine(); // read input
            VegChoice _veg = VegChoice.convertString(veg);

            // Create a new pizza and add it to the arraylist
            Pizza pizza = new Pizza(_meat, _veg);
            pizzas.add(pizza); // add pizza to arraylist
        }

        int x = 1; // loop variable
        System.out.println("\n\n*****************ORDER BREAKDOWN*****************");

        // Display order to customer
        for(Pizza e : pizzas) {
            System.out.println("\n>>PIZZA " + x + ":");
            System.out.println("Meat-Topping: " + e.get_Meat_Choice() + "\nVegetable Toppin: " + e.get_Veg_Choice()
                    + "\nNumber Of Slices: " + e.get_NumOfSlices());
            x++;
        }
        System.out.print("\n\nTHANK YOU FOR ORDERING FROM OKEY'S PASTRIES");
    }
}