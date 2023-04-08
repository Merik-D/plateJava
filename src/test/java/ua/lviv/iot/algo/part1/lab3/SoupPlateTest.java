package ua.lviv.iot.algo.part1.lab3;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class SoupPlateTest {
    Plate plate;

    @Before
    public void setUp(){
        plate = new SoupPlate(12, "Ceramic", "Red", false, true, 10, "borsch");
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
        assertEquals(282.6, plate.getMaxFoodWeight(), 0.1);
    }
}