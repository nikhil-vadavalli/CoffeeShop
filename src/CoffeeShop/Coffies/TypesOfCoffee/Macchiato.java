package CoffeeShop.Coffies.TypesOfCoffee;

import CoffeeShop.Coffies.Coffee;
import CoffeeShop.Coffies.Ingredient;

/**
 * Created by 38512 on 4/14/15.
 */
public class Macchiato extends Coffee {


    public Macchiato(int size, String madeFor) {
        super(
                new Ingredient[]{
                        new Ingredient("Espresso", 1),
                        new Ingredient("Milk Foam",1),
                }
                , 90, size, "Macchiato",madeFor);
    }
}
