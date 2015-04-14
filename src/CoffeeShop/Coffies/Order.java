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

    @Override
    public String toString() {
        String total = "";
        total += "============ORDER===========\n";
        total += "ORDER SIZE: " + getOrderSize() + "\n";
        total += "ORDER COST: " + getOrderCost() + "\n";
        total += "============================\n";

        for (Coffee c : order)
            total += c.toString() + "\n";

        total += "============================\n";

        return total;

    }
}
