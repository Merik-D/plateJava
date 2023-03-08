package ua.lviv.iot.algo.part1.lab1;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Plate {

    private static Plate defaultPlate = new Plate();
    private double diameter;
    private String material;
    private String color;
    private boolean isClean = false;
    private boolean hasFood = false;

    public static Plate getInstance(){
        return defaultPlate;
    }

    public void wash(){
        isClean = true;
    }

    public void dirty(){
        isClean = false;
    }
    public void eat(){
        hasFood = false;
        dirty();
    }
    public void addFood(){
        hasFood = true;
    }

    public static void main(String[] args) {
        Plate[] plates = new Plate[4];
        plates[0] = new Plate();
        plates[1] = new Plate(22, "Ceramic", "Red", false, true);
        plates[2] = getInstance();
        plates[3] = getInstance();
        for(int i=0; i<plates.length; i++){
            System.out.println(plates[i]);
        }
    }
}