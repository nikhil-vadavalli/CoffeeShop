package CoffeeShop.Coffies;

/**
 * Created by 38512 on 4/14/15.
 */
public class Order {
    Coffee[] order;

    public Order(Coffee[] coffees){
        order = coffees;
    }

    public int getOrderSize(){
        return order.length;
    }

    public double getOrderCost(){
        double total = 0;
        for (Coffee c : order)
            total += c.getCost();
        return total;
    }
}
