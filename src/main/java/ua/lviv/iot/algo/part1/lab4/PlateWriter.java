package ua.lviv.iot.algo.part1.lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PlateWriter {
    public String writeToFile(List<Plate> plates) throws IOException {
        if (plates == null || plates.isEmpty()) {
            return null;
        }
        String defaultFileName = "result.csv";
        try (FileWriter writer = new FileWriter(defaultFileName)) {
            Plate nextPlate = plates.get(0);
            writer.write(plates.get(0).getHeaders() + "\n");
            for (var plate : plates) {
                if (!nextPlate.getClass().isInstance(plate)) {
                    nextPlate = plate;
                    writer.write(plate.getHeaders() + "\n");
                }
                writer.write(plate.toCSV() + "\n");
            }
            return defaultFileName;
        }
    }
}
