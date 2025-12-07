package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("A1", "red", 1, 2, 3);
        Excavator excavator2 = new Excavator("B2", "blue", 4, 5, 6);
        Excavator excavator3 = new Excavator("C3", "green", 7, 8, 9);
        return List.of(excavator1, excavator2, excavator3);
    }
}
