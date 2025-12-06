package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Machine> get() {
        Excavator excavator1 = new Excavator("A1", "red");
        Excavator excavator2 = new Excavator("B2", "blue");
        Excavator excavator3 = new Excavator("C3", "green");
        return List.of(excavator1, excavator2, excavator3);
    }
}
