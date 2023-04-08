package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class DessertPlate extends Plate {
    private boolean picture;
    private int sections;

    public DessertPlate(final double diameter,
                        final String material,
                        final String color,
                        final boolean isClean,
                        final boolean hasFood,
                        final boolean picture,
                        final int sections) {
        super(diameter, material, color, isClean, hasFood);
        this.picture = picture;
        this.sections = sections;
    }

    @Override
    public final double getMaxFoodWeight() {
        return 3.14 * getDiameter() * getDiameter() * getDiameter() / 24;
    }
}
