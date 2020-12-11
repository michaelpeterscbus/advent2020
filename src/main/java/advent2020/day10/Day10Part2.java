package advent2020.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day10Part2 {

    public long calculateJoltage(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        List<Integer> joltages = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            joltages.add(Integer.parseInt(input));
        }
        joltages.add(0);
        Collections.sort(joltages);
        int endJoltage = joltages.get(joltages.size() - 1) + 3;
        joltages.add(endJoltage);

        int[] tribonacci = {1, 1, 2, 4, 7, 13, 24, 44, 81, 149};

        long arrangementSum = 1;
        int current = 1;
        for(int joltage : joltages) {
            if (joltages.contains(joltage + 1)) {
                current++;
            } else {
                arrangementSum *= tribonacci[current - 1];
                current = 1;
            }
        }

        return arrangementSum;
    }
}
