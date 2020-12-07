package advent2020.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Day6Part2 {
    public int sumGroupAnswers(String fileName) throws IOException {
        int sum = 0;
        Path path = Paths.get("src/test/resources/" + fileName);
        String input = Files.readString(path);
        String[] groups = input.split("\n\n");
        for (String group : groups) {
            String[] people = group.split("\n");
            int peopleCount = people.length;
            if (peopleCount == 1){
                sum += people[0].length();
            } else{
                Map<Character,Integer> letterMap = new HashMap<>();
                for (String person : people) {
                    for (int i = 0; i < person.length(); i++) {
                        if (!letterMap.containsKey(person.charAt(i))) {
                            letterMap.put(person.charAt(i), 1);
                        } else {
                            letterMap.put(person.charAt(i), letterMap.get(person.charAt(i)) + 1);
                        }
                    }
                    for (int value : letterMap.values()) {
                        if (value == peopleCount){
                            sum++;
                        }
                    }
                }
            }
        }
        return sum;
    }
}
