package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    public Truck() {
        this.setName("Default name");
        this.setColor("Default color");
    }
    public Truck(String name, String color) {
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
