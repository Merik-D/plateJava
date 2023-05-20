package ua.lviv.iot.algo.part1.lab6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.algo.part1.lab6.models.DessertPlate;
import ua.lviv.iot.algo.part1.lab6.service.DessertPlateService;

import java.util.Collection;

@RestController
@RequestMapping("/dessert-plates")
public class DessertPlateController {

    private final DessertPlateService dessertPlateService;

    @Autowired
    public DessertPlateController(DessertPlateService dessertPlateService) {
        this.dessertPlateService = dessertPlateService;
    }

    @GetMapping
    public ResponseEntity<Collection<DessertPlate>> getAllDessertPlates() {
        Collection<DessertPlate> dessertPlates = dessertPlateService.getAllDessertPlates();
        if (dessertPlates.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(dessertPlates);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<DessertPlate> getDessertPlateById(@PathVariable Integer id) {
        DessertPlate dessertPlate = dessertPlateService.getDessertPlateById(id);
        if (dessertPlate != null) {
            return ResponseEntity.ok(dessertPlate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<DessertPlate> addDessertPlate(@RequestBody DessertPlate dessertPlate) {
        DessertPlate addedDessertPlate = dessertPlateService.addDessertPlate(dessertPlate);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedDessertPlate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DessertPlate> updateDessertPlate(@PathVariable Integer id, @RequestBody DessertPlate dessertPlate) {
        DessertPlate updatedDessertPlate = dessertPlateService.updateDessertPlate(id, dessertPlate);
        if(updatedDessertPlate != null){
            return ResponseEntity.ok(updatedDessertPlate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteDessertPlate(@PathVariable Integer id) {
        if (dessertPlateService.deleteDessertPlate(id) != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
