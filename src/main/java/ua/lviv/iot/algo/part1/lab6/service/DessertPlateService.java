package ua.lviv.iot.algo.part1.lab6.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab6.models.DessertPlate;

import java.util.*;

@Service
@Scope("singleton")
public class DessertPlateService {
    private Map<Integer, DessertPlate> dessertPlates = new HashMap<>();
    private int nextAvailableId = 1;

    public DessertPlate addDessertPlate(DessertPlate dessertPlate) {
        dessertPlate.setId((Integer) nextAvailableId++);
        dessertPlates.put(dessertPlate.getId(), dessertPlate);
        return dessertPlate;
    }

    public DessertPlate getDessertPlateById(Integer id) {
        return dessertPlates.get(id);
    }

    public Collection<DessertPlate> getAllDessertPlates() {
        return dessertPlates.values();
    }

    public DessertPlate deleteDessertPlate(Integer id) {
        return dessertPlates.remove(id);
    }

    public DessertPlate updateDessertPlate(Integer id, DessertPlate dessertPlate) {
        if (dessertPlates.containsKey(id)) {
            dessertPlate.setId(id);
            dessertPlates.put(id, dessertPlate);
            return dessertPlate;
        }
        return null;
    }
}
