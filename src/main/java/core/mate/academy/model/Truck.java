package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxLoadCapacity;
    private int numberOfAxles;
    private String fuelType;

    public Truck() {
        this.setName("Default name");
        this.setColor("Default color");
        this.maxLoadCapacity = 0;
        this.numberOfAxles = 0;
        this. fuelType = "Default fuel";
    }

    public Truck(String name, String color, int maxLoadCapacity, int numberOfAxles,
                 String fuelType) {
        this.setName(name);
        this.setColor(color);
        this.maxLoadCapacity = maxLoadCapacity;
        this.numberOfAxles = numberOfAxles;
        this. fuelType = fuelType;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public Truck setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
        return this;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public Truck setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
        return this;
    }

    public String getFuelType() {
        return fuelType;
    }

    public Truck setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
