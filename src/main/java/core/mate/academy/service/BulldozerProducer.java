package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Machine> get() {
        Bulldozer bulldozer1 = new Bulldozer("A1", "red");
        Bulldozer bulldozer2 = new Bulldozer("B2", "blue");
        Bulldozer bulldozer3 = new Bulldozer("C3", "green");
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
