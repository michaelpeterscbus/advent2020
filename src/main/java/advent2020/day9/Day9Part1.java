package advent2020.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day9Part1 {

    public int findFirstInvalid(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        List<Integer> mathList = new ArrayList<>();
        int index = 0;
        int invalidNumber = 0;
        while ((input = br.readLine()) != null) {
            boolean foundInvalid = false;
            if (index < 25) {
                mathList.add(Integer.parseInt(input));
            }
            if (index >= 25) {
                Integer numberToCheck = Integer.parseInt(input);
                for (int i = 0; i < mathList.size(); i++){
                    if (mathList.contains(numberToCheck - mathList.get(i)) &&
                            !numberToCheck.equals(mathList.get(i))){
                        mathList.remove(0);
                        mathList.add(numberToCheck);
                        break;
                    } else if (i == mathList.size() - 1){
                        foundInvalid = true;
                        invalidNumber = numberToCheck;
                    }
                }
            }
            if (foundInvalid){
                break;
            }
            index++;
        }
        return invalidNumber;
    }
}
