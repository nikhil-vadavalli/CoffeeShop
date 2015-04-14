package CoffeeShop.Coffies;

/**
 * Created by 38512 on 4/14/15.
 */
public class Ingredient {
    private String name;
    private double cost;

    public Ingredient(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
