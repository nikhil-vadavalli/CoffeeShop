package CoffeeShop.Coffies;

/**
 * Created by 38512 on 4/14/15.
 */
public class Coffee {
    private boolean made;
    private double tempreture;
    private double cost;
    private String size;
    private String name;
    private Ingredient[] ingredients;

    public Coffee(Ingredient[] ingredients, double temperature, int size, String name) {
        this.tempreture = temperature;
        this.name = name;
        this.ingredients = ingredients;
        this.made = false;

        if (size <= 1)
            this.size = "Small";
        else if (size == 2)
            this.size = "Medium";
        else
            this.size = "Large";


        double total = 0;
        for (Ingredient i: ingredients)
            total += i.getCost();

        this.cost = total + (total * 0.4) + (size * .75);
    }

    public double getCost() {
        return cost;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    private String getStatus(){
        if (made)
            return "Ready";
        else
            return "Not Ready";
    }

    @Override
    public String toString() {
        return size + " " + name + ": " + getStatus();
    }

    public void make() {
        made = true;
    }

    public void pay() {
        cost = 0;
    }
}
