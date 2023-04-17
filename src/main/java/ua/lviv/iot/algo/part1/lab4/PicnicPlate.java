package ua.lviv.iot.algo.part1.lab4;

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

    public String getHeaders(){
        return HEADERS + ", lid, compartments";
    }

    public String toCSV(){
        return super.toCSV() + ", " + lid + ", " + compartments;
    }
}

