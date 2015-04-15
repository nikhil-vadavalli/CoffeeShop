package CoffeeShop.Employees;

import CoffeeShop.Coffies.Coffee;
import CoffeeShop.Coffies.Order;

/**
 * Created by 38512 on 4/14/15.
 */
public class Barista extends Employee {
    private int skillLevel = 0;

    public Barista(String name, double wagePerCup, int skillLevel) {
        super(name, wagePerCup);


        if (skillLevel > 10)
            skillLevel = 10;
        else if (skillLevel < 0)
            skillLevel = 0;
    }

    public void makeOrder(Order coffees) {
        for (Coffee c : coffees.getOrder())
            c.make();
    }

}
