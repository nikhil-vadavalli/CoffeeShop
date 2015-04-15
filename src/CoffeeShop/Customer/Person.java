package CoffeeShop.Customer;

import CoffeeShop.Coffies.Coffee;
import CoffeeShop.Coffies.Order;

/**
 * Created by 38512 on 4/14/15.
 */
public class Person {
    private String name;
    private Order order;
    private double money;

    public Person(String name, Order order, double money) {
        this.name = name;
        this.order = order;
        this.money = money;
    }

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
        order = new Order();
    }

    public void addToOrder(Coffee coffee){
        this.order.addToOrder(coffee);
    }

    public boolean payForOrder(Order order){
        if (money >= order.getOrderCost()) {
            money -= order.getOrderCost();
            order.pay();
            return true;
        } else
            return false;
    }

    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }

    public double getMoney() {
        return money;
    }
}
