package advent2020.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day7Part1 {
    public Day7Part1() {
    }

    public int getBags(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        List<Bag> bags = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            Bag bag = new Bag();
            input = input.replaceAll(" bags", "");
            input = input.replaceAll(" bag", "");
            input = input.replaceAll("\\.", "");
            String[] inputArr = input.split(" contain ");
            bag.setColor(inputArr[0]);
            if (!inputArr[1].equals("no other")) {
                Map<String, Integer> contentMap = new HashMap<>();
                String[] contentArr = inputArr[1].split(",");
                for (String contentStr : contentArr) {
                    contentStr = contentStr.strip();
                    Integer mapCount = Integer.parseInt(contentStr.substring(0, 1));
                    String mapColor = contentStr.substring(2);
                    contentMap.put(mapColor, mapCount);
                }
                bag.setContent(contentMap);
                bags.add(bag);
            }
            System.out.println(inputArr[0]);
        }
        System.out.println(bags);
        return 0;
    }
}
