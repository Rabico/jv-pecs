package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Machine> get() {
        Truck truck1 = new Truck("A1", "red");
        Truck truck2 = new Truck("B2", "blue");
        Truck truck3 = new Truck("C3", "green");
        return List.of(truck1, truck2, truck3);
    }
}
