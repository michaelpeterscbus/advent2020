package advent2020.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day7Part1 {
    public Day7Part1() {
    }

    public int getBags(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        Map<String, Map<String, Integer>> bags = new HashMap<>();
        while ((input = br.readLine()) != null) {
            input = input.replaceAll(" bags", "");
            input = input.replaceAll(" bag", "");
            input = input.replaceAll("\\.", "");
            String[] inputArr = input.split(" contain ");
            String color = inputArr[0];
            if (!inputArr[1].equals("no other")) {
                Map<String, Integer> contentMap = new HashMap<>();
                String[] contentArr = inputArr[1].split(",");
                for (String contentStr : contentArr) {
                    contentStr = contentStr.strip();
                    Integer mapCount = Integer.parseInt(contentStr.substring(0, 1));
                    String mapColor = contentStr.substring(2);
                    contentMap.put(mapColor, mapCount);
                }
                bags.put(color, contentMap);
            }
        }
        int shinyGoldCount = 0;
        for (String color: bags.keySet()){
            if (containsShinyGold(color, bags)) {
                shinyGoldCount++;
            }
        }
        return shinyGoldCount;
    }

    public boolean containsShinyGold(String color, Map<String, Map<String,Integer>> bags){
        Map<String,Integer> content = bags.get(color);
        if (content != null) {
            for (String contentColor : content.keySet()) {
                if (contentColor.equals("shiny gold")) {
                    return true;
                }
                if (containsShinyGold(contentColor, bags)) {
                    return true;
                }
            }
        }
        return false;
    }
}
