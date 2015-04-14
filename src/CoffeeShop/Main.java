package CoffeeShop;

import CoffeeShop.Coffies.Coffee;
import CoffeeShop.Coffies.TypesOfCoffee.Macchiato;
import CoffeeShop.Customer.Person;

/**
 * Created by 38512 on 4/14/15.
 */
public class Main {
    public static void main(String[] args) {

        Person jeff = new Person("Jeff",new Coffee[]{new Macchiato(2,"Jeff")}, 100);

    }
}
