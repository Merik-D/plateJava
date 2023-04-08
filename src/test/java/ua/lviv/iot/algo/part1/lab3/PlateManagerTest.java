package ua.lviv.iot.algo.part1.lab3;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlateManagerTest {
    PlateManager plateManager;
    Plate plate1;
    Plate plate2;
    Plate plate3;
    Plate plate4;

    @Before
    public void setUp() {
        plateManager = new PlateManager();
        plate1 = new SaladPlate(24, "Porcelain", "Black", false, true, "rectangel", true);
        plate2 = new SoupPlate(40, "Ceramic", "Gray", false, true, 15, "Mushroom broth");
        plate3 = new PicnicPlate(15, "Faience", "Red", true, true, true, 5);
        plate4 = new DessertPlate(18, "Porcelain", "Yellow", true, true, true, 3);
        plateManager.addPlate(plate1);
        plateManager.addPlate(plate2);
        plateManager.addPlate(plate3);
        plateManager.addPlate(plate4);
    }
    @DisplayName("Test adding plates to the list")
    @Test
    public void testAddLaptop() {
        assertEquals(4, plateManager.getPlates().size());
    }

    @DisplayName("Test finding plates with diameter greater than specified")
    @Test
    public void testFindPlateWithDiameterGreaterThan() {
        List<Plate> expectedPlates = new LinkedList<>();
        expectedPlates.add(new SaladPlate(24, "Porcelain", "Black", false, true, "rectangel", true));
        expectedPlates.add(new SoupPlate(40, "Ceramic", "Gray", false, true, 15, "Mushroom broth"));
        assertEquals(expectedPlates.toString(), plateManager.findPlateWithDiameterGreaterThan(20).toString());
    }

    @DisplayName("Test finding all clean plates")
    @Test
    public void testFindAllClean(){
        List<Plate> expectedPlate = new LinkedList<>();
        expectedPlate.add(new PicnicPlate(15, "Faience", "Red", true, true, true, 5));
        expectedPlate.add(new DessertPlate(18, "Porcelain", "Yellow", true, true, true, 3));

        //var platesAllClean = plateManager.findAllClean();
        assertEquals(expectedPlate.toString(), plateManager.findAllClean().toString());
    }
}