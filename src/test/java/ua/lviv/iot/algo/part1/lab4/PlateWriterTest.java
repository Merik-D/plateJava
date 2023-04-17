package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class PlateWriterTest {
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";

    private PlateWriter writer = new PlateWriter();
    private List<Plate> plates = new LinkedList<>();
    @BeforeEach
    public void setUp() throws IOException {
        writer = new PlateWriter();
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

    @Test
    public void testEmptyWrite() throws IOException {
        writer.writeToFile(plates);
        File file = new File(RESULT_FILENAME);
        Assertions.assertFalse(file.exists());
    }

    @Test
    public void testWriteList() throws IOException{
        plates.add(new SoupPlate(12, "Ceramic", "Red", false, true, 10, "borsch"));
        plates.add(new SaladPlate(24, "Faience", "Gray", true, true, "oval", true));
        plates.add(new SaladPlate(30, "Porcelain", "Black", false, true, "rectangel", true));
        plates.add(new SoupPlate(40, "Ceramic", "Gray", true, true, 15, "Mushroom broth"));
        plates.add(new PicnicPlate(54, "Faience", "Red", false, true, true, 5));
        plates.add(new PicnicPlate(74, "Faience", "Red", false, true, true, 7));
        plates.add(new DessertPlate(60, "Porcelain", "Yellow", true, true, true, 3));
        plates.add(new DessertPlate(80, "Porcelain", "Pink", true, true, false, 4));
        writer.writeToFile(plates);
        File file = new File(RESULT_FILENAME);

        Path expected = new File(RESULT_FILENAME).toPath();
        Path actual = new File(EXPECTED_FILENAME).toPath();

        System.out.println(Files.mismatch(expected, actual));
        Assertions.assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testWriteToFileExistingFile() throws IOException {
        FileWriter fileWriter = new FileWriter(RESULT_FILENAME);
        fileWriter.write("Some existing text");
        fileWriter.close();
        testWriteList();
    }
}