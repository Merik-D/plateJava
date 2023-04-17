package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlateManagerTest {
    private PlateManager plateManager;

    @BeforeEach
    public void setUp() {
        plateManager = new PlateManager();
        plateManager.addPlate(new SaladPlate(24, "Porcelain", "Black", false, true, "rectangel", true));
        plateManager.addPlate(new SoupPlate(40, "Ceramic", "Gray", false, true, 15, "Mushroom broth"));
        plateManager.addPlate(new PicnicPlate(15, "Faience", "Red", true, true, true, 5));
        plateManager.addPlate(new DessertPlate(18, "Porcelain", "Yellow", true, true, true, 3));
    }

    @DisplayName("Test adding plates to the list")
    @Test
    public void testAddLaptop() {
        assertEquals(4, plateManager.getPlates().size());
    }

    @DisplayName("Test finding plates with diameter greater than specified")
    @Test
    public void testFindPlateWithDiameterGreaterThan() {
        var platesWithDiameterGreaterThan = plateManager.findPlateWithDiameterGreaterThan(20);
        assertEquals(2, platesWithDiameterGreaterThan.size());
        for (var plate : platesWithDiameterGreaterThan) {
            assertTrue(plate.getDiameter() > 20);
        }
    }

    @Test
    @DisplayName("Test finding all clean plates")
    public void testFindAllClean() {
        var cleanPlates = plateManager.findAllClean();
        assertEquals(2, cleanPlates.size());
        for (Plate plate : cleanPlates) {
            assertTrue(plate.isClean());
        }
    }
}