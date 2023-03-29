package ua.lviv.iot.algo.part1.lab2;

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

    public DessertPlate(double diameter, String material, String color, boolean isClean, boolean hasFood, boolean picture, int sections) {
        super(diameter, material, color, isClean, hasFood);
        this.picture = picture;
        this.sections = sections;
    }

    @Override
    double getMaxFoodWeight() {
        return (3.14 * getDiameter()/2 * (getDiameter() / 2) * (getDiameter() / 2)) / 3;
    }
}
