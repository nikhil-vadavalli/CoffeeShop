package CoffeeShop.Customer;

import CoffeeShop.Coffies.Coffee;

/**
 * Created by 38512 on 4/14/15.
 */
public class Person {
    private String name;
    private Coffee[] order;
    private double money;

    public Person(String name, Coffee[] order, double money) {
        this.name = name;
        this.order = order;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public Coffee[] getOrder() {
        return order;
    }

    public double getMoney() {
        return money;
    }
}
