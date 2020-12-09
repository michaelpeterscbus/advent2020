package advent2020.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day9Part2 {

    public int findEncryptionWeakness(Integer invalidNumber, String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        List<Integer> allNumbers = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            try {
                allNumbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e){
                allNumbers.add(Integer.MAX_VALUE);
            }
        }
        for (int i = -1; i < allNumbers.size(); i++){
            int j = i + 1;
            int sum = 0;
            List<Integer> rangeList = new ArrayList<>();
            while (sum < invalidNumber) {
                sum += allNumbers.get(j);
                rangeList.add(allNumbers.get(j));
                j++;
            }
            if (sum == invalidNumber){
                return Collections.max(rangeList) + Collections.min(rangeList);
            }
        }
        return 0;
    }
}
