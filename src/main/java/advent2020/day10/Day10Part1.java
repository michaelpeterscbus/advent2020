package advent2020.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day10Part1 {
    public int calculateJoltage(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        List<Integer> joltages = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            joltages.add(Integer.parseInt(input));
        }
        Collections.sort(joltages);
        int plus1 = 0;
        int plus3 = 1;
        if (joltages.get(0) == 1){
            plus1++;
        } else if (joltages.get(0) == 3) {
            plus3++;
        }
        for (int i = 0; i < joltages.size() - 1; i++) {
            if (joltages.get(i + 1) - 3 == joltages.get(i)) {
                plus3++;
            }
            else if (joltages.get(i + 1) - 1 == joltages.get(i)){
                plus1++;
            }
        }
        return plus3 * plus1;
    }
}
