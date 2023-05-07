package ua.lviv.iot.algo.part1.lab6.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class SaladPlateTest {
    Plate plate;

    @Before
    public void setUp(){
        plate = new SaladPlate(20, "Porcelain", "Red", true, true, "rectangel", true);
    }

    @DisplayName("Test wash")
    @Test
    public void testWash(){
        this.plate.wash();
        assertEquals(true, this.plate.isClean());
    }

    @DisplayName("Test dirty")
    @Test
    public void testDirty(){
        this.plate.dirty();
        assertEquals(false, this.plate.isClean());
    }

    @DisplayName("Test add food")
    @Test
    public void testAddFood(){
        this.plate.addFood();
        assertEquals(true, plate.isHasFood());
    }

    @DisplayName("Test eat")
    @Test
    public void testEat(){
        this.plate.eat();
        assertFalse(plate.isClean());
        assertFalse(plate.isHasFood());
    }

    @DisplayName("Test weight")
    @Test
    public void testGetMaxFoodWeight(){
        assertEquals(1047.1975512, plate.getMaxFoodWeight(), 0.1);
    }
}
