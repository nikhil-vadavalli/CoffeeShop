package CoffeeShop.Coffies.TypesOfCoffee;

import CoffeeShop.Coffies.Coffee;
import CoffeeShop.Coffies.Ingredient;

/**
 * Created by 38512 on 4/14/15.
 */
public class CafeMocha extends Coffee {

    public CafeMocha(int size, String madeFor) {
        super(
                new Ingredient[]{
                new Ingredient("Espresso", 0.5),
                new Ingredient("Chocolate",0.25),
                new Ingredient("Steamed Milk", 0.5),
                new Ingredient("Whipped Cream", 1),
                }
                , 90, size, "CafeMocha",madeFor);
    }
}
