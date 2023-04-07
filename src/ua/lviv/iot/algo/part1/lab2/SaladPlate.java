package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class SaladPlate extends Plate {
    private String shape;
    private boolean dishwasherSafe;

    public SaladPlate(double diameter, String material, String color, boolean isClean, boolean hasFood, String shape, boolean dishwasherSafe) {
        super(diameter, material, color, isClean, hasFood);
        this.shape = shape;
        this.dishwasherSafe = dishwasherSafe;
    }

    @Override
    public double getMaxFoodWeight() {
        return 3.14 * getDiameter() * getDiameter() * getDiameter() / 24;
    }
}
