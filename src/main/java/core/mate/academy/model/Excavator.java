package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int armLength;
    private int bucketCapacity;
    private int operatingWeight;

    public Excavator() {
        this.setName("Default name");
        this.setColor("Default color");
        this.armLength = 0;
        this.bucketCapacity = 0;
        this.operatingWeight = 0;
    }

    public Excavator(String name, String color, int armLength, int bucketCapacity,
                     int operatingWeight) {
        this.setName(name);
        this.setColor(color);
        this.armLength = armLength;
        this.bucketCapacity = bucketCapacity;
        this.operatingWeight = operatingWeight;
    }

    public int getArmLength() {
        return armLength;
    }

    public Excavator setArmLength(int armLength) {
        this.armLength = armLength;
        return this;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public Excavator setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
        return this;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public Excavator setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
