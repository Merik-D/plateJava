package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Plate {
    private static Plate instance = new Plate();
    private double diameter;
    private String material;
    private String color;
    private boolean isClean = false;
    private boolean hasFood = false;

    public static Plate getInstance() {
        return instance;
    }

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

    public static void main(String[] args) {
        Plate[] plates = {
                new ua.lviv.iot.algo.part1.lab1.Plate(),
                new ua.lviv.iot.algo.part1.lab1.Plate(22, "Ceramic", "Red", false, true),
                getInstance(),
                getInstance()};
        for (ua.lviv.iot.algo.part1.lab1.Plate plate : plates) {
            System.out.println(plate);
        }
    }
}
