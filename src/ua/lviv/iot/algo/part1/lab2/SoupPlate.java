package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class SoupPlate extends Plate {
    private int plateDepthInCm;
    private String typeOfSoup;

    public SoupPlate(double diameter, String material, String color, boolean isClean, boolean hasFood, int plateDepthInCm, String typeOfSoup) {
        super(diameter, material, color, isClean, hasFood);
        this.plateDepthInCm = plateDepthInCm;
        this.typeOfSoup = typeOfSoup;
    }

    @Override
    public double getMaxFoodWeight() {
        return (3.14 * plateDepthInCm * (getDiameter() / 2) * (getDiameter() / 2)) / 2;
    }
}
