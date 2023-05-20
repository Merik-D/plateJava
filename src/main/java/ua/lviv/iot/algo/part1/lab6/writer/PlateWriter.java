package ua.lviv.iot.algo.part1.lab6.writer;

import ua.lviv.iot.algo.part1.lab6.models.Plate;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlateWriter {
    public static final String DEFAULTFILE = "result.csv";

    public String writeToFile(final List<Plate> plates) {
        if (plates == null || plates.isEmpty()) {
            return null;
        }
        Collections.sort(plates,
                Comparator.comparing(p -> p.getClass().getSimpleName())
        );
        try (FileWriter writer = new FileWriter(DEFAULTFILE, StandardCharsets.UTF_8)) {
            Plate nextPlate = plates.get(0);
            writer.write(plates.get(0).getHeaders() + "\n");
            for (var plate : plates) {
                if (!nextPlate.getClass().isInstance(plate)) {
                    nextPlate = plate;
                    writer.write(plate.getHeaders() + "\n");
                }
                writer.write(plate.toCSV() + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return DEFAULTFILE;
    }
}
