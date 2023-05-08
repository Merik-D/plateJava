package ua.lviv.iot.algo.part1.lab6.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@NoArgsConstructor
public class DessertPlate extends Plate {
    private boolean picture;
    private int sections;
    @Setter
    @Getter
    private Integer id;

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
        return Math.PI * getDiameter() * getDiameter() * getDiameter() / 24;
    }

    @JsonIgnore
    public final String getHeaders() {
        return super.getHeaders() + ", picture, sections";
    }

    public final String toCSV() {
        return super.toCSV() + ", " + picture + ", " + sections;
    }
}
