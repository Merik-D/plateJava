package ua.lviv.iot.algo.part1.lab4.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SoupPlate extends Plate {
    private int plateDepthInCm;
    private String typeOfSoup;

    public SoupPlate(final double diameter,
                     final String material,
                     final String color,
                     final boolean isClean,
                     final boolean hasFood,
                     final int plateDepthInCm,
                     final String typeOfSoup) {
        super(diameter, material, color, isClean, hasFood);
        this.plateDepthInCm = plateDepthInCm;
        this.typeOfSoup = typeOfSoup;
    }

    @Override
    public final double getMaxFoodWeight() {
        return Math.PI * plateDepthInCm * getDiameter() * getDiameter() / 16;
    }

    public final String getHeaders() {
        return super.getHeaders() + ", plateDepthInCm, typeOfSoup";
    }

    public final String toCSV() {
        return super.toCSV() + ", " + plateDepthInCm + ", " + typeOfSoup ;
    }
}
