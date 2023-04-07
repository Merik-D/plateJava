package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class PicnicPlate extends Plate {
    private boolean lid;
    private int compartments;

    public PicnicPlate(double diameter, String material, String color, boolean isClean, boolean hasFood, boolean lid, int compartments) {
        super(diameter, material, color, isClean, hasFood);
        this.lid = lid;
        this.compartments = compartments;
    }

    @Override
    public double getMaxFoodWeight() {
        return 3.14 * getDiameter() * getDiameter() * getDiameter() / 16;
    }
}
