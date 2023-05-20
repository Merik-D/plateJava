package ua.lviv.iot.algo.part1.lab6.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PicnicPlate extends Plate {
    private boolean lid;
    private int compartments;

    public PicnicPlate(final double diameter,
                       final String material,
                       final String color,
                       final boolean isClean,
                       final boolean hasFood,
                       final boolean lid,
                       final int compartments) {
        super(diameter, material, color, isClean, hasFood);
        this.lid = lid;
        this.compartments = compartments;
    }

    @Override
    public final double getMaxFoodWeight() {
        return Math.PI * getDiameter() * getDiameter() * getDiameter() / 16;
    }

    public final String getHeaders() {
        return super.getHeaders() + ", lid, compartments";
    }

    public final String toCSV() {
        return super.toCSV() + ", " + lid + ", " + compartments;
    }
}
