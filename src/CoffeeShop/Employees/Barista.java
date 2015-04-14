package CoffeeShop.Employees;

import CoffeeShop.Coffies.Coffee;

/**
 * Created by 38512 on 4/14/15.
 */
public class Barista extends Employee {
    private int skillLevel = 0;

    public Barista(String name, int salary, int skillLevel) {
        super(name, salary);

        if (skillLevel > 10)
            skillLevel = 10;
        else if (skillLevel < 0)
            skillLevel = 0;
    }

    public Coffee makeCoffee(Coffee coffee){
        return coffee;
    }

}
