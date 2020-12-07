package advent2020.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class Day6Part1 {
    public int sumYesAnswers(String fileName) throws IOException {
        int sum = 0;
        Path path = Paths.get("src/test/resources/" + fileName);
        String input = Files.readString(path);
        String[] groupArray = input.split("\n\n");
        for (String group : groupArray) {
            group = group.replaceAll("\n","");
            Set<Character> answers = new HashSet<>();
            for (int i = 0; i < group.length(); i++) {
                answers.add(group.charAt(i));
            }
            sum += answers.size();
        }
        return sum;
    }

}
