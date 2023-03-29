package ua.lviv.iot.algo.part1.lab2;

import java.util.LinkedList;
import java.util.List;

public class PlateManager {
    private final List<Plate> plateList = new LinkedList<>();
    public void addPlate (Plate plate) {
        this.plateList.add(plate);
    }

    public void findPlateWithDiameterGreaterThan(double value) {
        System.out.println("All plate with diameter greater than " + value + "cm");
        plateList.stream()
                .filter(plate -> plate.getDiameter() > value)
                .forEach(System.out::println);
    }

    public void findAllClean(){
        System.out.println("All clean");
        plateList.stream()
                .filter(plate -> plate.isClean())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        PlateManager plateManager = new PlateManager();
        plateManager.addPlate(new SoupPlate(12, "Ceramic", "Red", false, true, 10, "borsch"));
        plateManager.addPlate(new SaladPlate(24, "Faience", "Gray", true, true, "oval", true));
        plateManager.addPlate(new SaladPlate(30, "Porcelain", "Black", false, true, "rectangel", true));
        plateManager.addPlate(new SoupPlate(40, "Ceramic", "Gray", true, true, 15, "Mushroom broth"));
        plateManager.addPlate(new ua.lviv.iot.algo.part1.lab2.PicnicPlate(54, "Faience", "Red", false, true, true, 5));
        plateManager.addPlate(new ua.lviv.iot.algo.part1.lab2.DessertPlate(60, "Porcelain", "Yellow", true, true, true, 3));
        plateManager.addPlate(new ua.lviv.iot.algo.part1.lab2.PicnicPlate(74, "Faience", "Red", false, true, true, 7));
        plateManager.addPlate(new ua.lviv.iot.algo.part1.lab2.DessertPlate(80, "Porcelain", "Pink", true, true, false, 4));

        plateManager.plateList.forEach(System.out::println);
        System.out.println("\n");
        plateManager.findPlateWithDiameterGreaterThan(30);
        System.out.println("\n");
        plateManager.findAllClean();
    }
}
