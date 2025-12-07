package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("A1", "red", 1,2,"diesel");
        Truck truck2 = new Truck("B2", "blue", 3,4,"electric");
        Truck truck3 = new Truck("C3", "green", 5,6,"hybrid");
        return List.of(truck1, truck2, truck3);
    }
}
