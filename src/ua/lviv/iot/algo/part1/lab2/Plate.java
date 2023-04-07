package ua.lviv.iot.algo.part1.lab2;

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

    public void wash() {
        isClean = true;
    }

    public void dirty() {
        isClean = false;
    }

    public void eat() {
        hasFood = false;
        dirty();
    }

    public void addFood() {
        hasFood = true;
    }

    public abstract double getMaxFoodWeight();
}
