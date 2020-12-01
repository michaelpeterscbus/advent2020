package advent2020.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TestUtils {
    public String[] getInput(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        String input = Files.readString(file.toPath());
        return input.split("\n");
    }
}
