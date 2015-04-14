package CoffeeShop.Coffies;
/**
 * Created by 38512 on 4/14/15.
 */
public class Coffee {
    private double tempreture;
    private double cost;
    private String size;
    private String name;
    private String madeFor;
    private Ingredient[] ingredients;

    public Coffee(Ingredient[] ingredients, double temperature, int size, String name, String madeFor) {
        this.tempreture = temperature;
        this.name = name;
        this.ingredients = ingredients;
        this.madeFor = madeFor;

        if (size >= 1)
            this.size = "Small";
        else if (size == 2)
            this.size = "Medium";
        else
            this.size = "Large";


        double total = 0;
        for (Ingredient i: ingredients)
            total += i.getCost();

        this.cost = total + (total * 0.4);
    }

    public double getCost() {
        return cost;
    }

    public String getMadeFor() {
        return madeFor;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return size + " " + name;
    }
}
