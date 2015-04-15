package CoffeeShop;

import CoffeeShop.Coffies.Coffee;
import CoffeeShop.Coffies.Order;
import CoffeeShop.Coffies.TypesOfCoffee.CafeMocha;
import CoffeeShop.Coffies.TypesOfCoffee.Macchiato;
import CoffeeShop.Customer.Person;
import CoffeeShop.Employees.Barista;

import java.util.ArrayList;

/**
 * Created by 38512 on 4/14/15.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Coffee> smallOrder = new ArrayList<>();
        smallOrder.add(new Macchiato(2));
        smallOrder.add(new CafeMocha(3));
        ArrayList<Coffee> mediumOrder = new ArrayList<>();
        ArrayList<Coffee> bigOrder = new ArrayList<>();

        Barista clive = new Barista("Clive",0.03,4);

        Person jeff = new Person("Jeff", new Order(smallOrder, "Jeff"), 100);

        System.out.println(jeff.getOrder());

        clive.makeOrder(jeff.getOrder());

        System.out.println(jeff.getOrder());

        jeff.payForOrder(jeff.getOrder());


    }
}
