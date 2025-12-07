package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWidth;
    private int enginePower;
    private int weight;

    public Bulldozer() {
        this.setName("Default name");
        this.setColor("Default color");
        this.bladeWidth = 0;
        this.enginePower = 0;
        this.weight = 0;
    }

    public Bulldozer(String name, String color, int bladeWidth, int enginePower, int weight) {
        this.setName(name);
        this.setColor(color);
        this.bladeWidth = bladeWidth;
        this.enginePower = enginePower;
        this.weight = weight;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public Bulldozer setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
        return this;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public Bulldozer setEnginePower(int enginePower) {
        this.enginePower = enginePower;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Bulldozer setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
