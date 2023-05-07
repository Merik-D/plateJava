package ua.lviv.iot.algo.part1.lab6.manager;

import ua.lviv.iot.algo.part1.lab6.models.Plate;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PlateManager {
    private final List<Plate> plateList = new LinkedList<>();
    public final void addPlate(final Plate plate) {
        this.plateList.add(plate);
    }

    public final List<Plate> findPlateWithDiameterGreaterThan(final double value) {
        return plateList.stream()
                .filter(plate -> plate.getDiameter() > value)
                .collect(Collectors.toList());
    }

    public final List<Plate> findAllClean() {
        return plateList.stream()
                .filter(plate -> plate.isClean())
                .collect(Collectors.toList());
    }

    public final List<Plate> getPlates() {
        return Collections.unmodifiableList(plateList);
    }
}
