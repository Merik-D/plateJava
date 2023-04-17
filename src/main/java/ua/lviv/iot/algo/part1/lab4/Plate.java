package ua.lviv.iot.algo.part1.lab4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Plate {
    private double diameter;
    private String material;
    private String color;
    private boolean isClean = false;
    private boolean hasFood = false;
    public static final String HEADERS = "diameter, material, color, isClean, hasFood";
    public final void wash() {
        isClean = true;
    }

    public final void dirty() {
        isClean = false;
    }

    public final void eat() {
        hasFood = false;
        dirty();
    }

    public final void addFood() {
        hasFood = true;
    }

    public abstract double getMaxFoodWeight();

    public String getHeaders(){
        return HEADERS;
    }

    public String toCSV(){
        return diameter + ", " + material + ", " + color + ", " + isClean + ", " + hasFood;
    }
}

