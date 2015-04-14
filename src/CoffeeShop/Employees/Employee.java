package CoffeeShop.Employees;

/**
 * Created by 38512 on 4/14/15.
 */
public class Employee {
    private String name;
    private double salary;
    private static int ID;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.ID = ID++;
    }

    public void increaseSalary(double ammount){
        salary += ammount;
    }

    public void decreaseSalary(double ammount){
        salary -= ammount;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static int getID() {
        return ID;
    }
}
