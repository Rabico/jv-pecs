package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("A1", "red", 1,2,3);
        Bulldozer bulldozer2 = new Bulldozer("B2", "blue",4,5,6);
        Bulldozer bulldozer3 = new Bulldozer("C3", "green", 6, 7, 8);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
