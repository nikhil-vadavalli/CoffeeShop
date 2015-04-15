package CoffeeShop.Shop.Stuff;

import CoffeeShop.Coffies.Coffee;

/**
 * Created by 38512 on 4/15/15.
 */
public class CoffeeMaker extends Furniture {
    double coffeePerMinute;

    public CoffeeMaker(String name, double cost, double coffeePerMinute) {
        super(name, cost);
        this.coffeePerMinute = coffeePerMinute;
    }

    public boolean makeCoffee(Coffee coffee){
        return true;
    }
}
