package CoffeeShop.Coffies;

import java.util.ArrayList;

/**
 * Created by 38512 on 4/14/15.
 */
public class Order {
    String orderName;
    ArrayList<Coffee> order;

    public Order() {
        orderName = "NO_NAME";
        order = new ArrayList<Coffee>();
    }

    public ArrayList<Coffee> getOrder(){
        return order;
    }

    public Order(ArrayList<Coffee> coffees, String orderName){
        order = coffees;
        this.orderName = orderName;
    }

    public void addToOrder(Coffee coffee){
        order.add(coffee);
    }

    public int getOrderSize(){
        return order.size();
    }

    public double getOrderCost(){
        double total = 0;
        for (Coffee c : order)
            total += c.getCost();
        return total;
    }

    @Override
    public String toString() {

        if (orderName.equals("NO_NAME"))
            return "NO ORDER";

        final int EQUALS_LENGTH = 10;
        int size = (EQUALS_LENGTH + 10 + orderName.length() + EQUALS_LENGTH);

        String total = "";
        total += manyCharacters('=', EQUALS_LENGTH);
        total += "ORDER FOR " + orderName.toUpperCase();
        total += manyCharacters('=', EQUALS_LENGTH)  + "\n";
        total += "ORDER SIZE: " + getOrderSize() + "\n";
        total += "ORDER COST: $" + getOrderCost() + "\n";
        total += manyCharacters('=', size) + "\n";

        for (Coffee c : order)
            total += c.toString() + "\n";

        total += manyCharacters('=', size);

        return total;

    }

    private String manyCharacters(char character, int howMany){
        String total = "";
        for (int i = 0; i < howMany; i++) {
            total += character;
        }
        return total;
    }

    public void pay() {
        for (Coffee c : order)
            c.pay();
    }
}
