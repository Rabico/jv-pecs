package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    private BulldozerProducer bulldozerProducer;
    private ExcavatorProducer excavatorProducer;
    private TruckProducer truckProducer;

    public MachineServiceImpl() {

        bulldozerProducer = new BulldozerProducer();
        excavatorProducer = new ExcavatorProducer();
        truckProducer = new TruckProducer();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {

        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(bulldozerProducer.get());
        }

        if (type.equals(Excavator.class)) {
            return new ArrayList<>(excavatorProducer.get());
        }

        if (type.equals(Truck.class)) {
            return new ArrayList<>(truckProducer.get());
        }

        return List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {

        final var passedListSize = machines.size();
        for (var x = 0; x < passedListSize; x++) {
            machines.set(x, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }
}
