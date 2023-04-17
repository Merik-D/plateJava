package ua.lviv.iot.algo.part1.lab3;

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

    public SaladPlate(final double diameter,
                      final String material,
                      final String color,
                      final boolean isClean,
                      final boolean hasFood,
                      final String shape,
                      final boolean dishwasherSafe) {
        super(diameter, material, color, isClean, hasFood);
        this.shape = shape;
        this.dishwasherSafe = dishwasherSafe;
    }

    @Override
    public final double getMaxFoodWeight() {
        return Math.PI * getDiameter() * getDiameter() * getDiameter() / 24;
    }
}

