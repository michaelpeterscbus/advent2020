package advent2020.day1;

import java.util.Arrays;
import java.util.List;

public class Day1Part1 {
    public int findAndMultiplyEntries(Integer[] input) {
        for (int i = 0; i < input.length - 1; i++){
            for(int j = 1; j < input.length; j++) {
                if (i != j){
                    if (input[i] + input[j] == 2020){
                        return input[i] * input[j];
                    }
                }
            }
        }
        return 0;
    }

    public int findAndMultiplyEntriesAlternate(Integer[] input) {
        List<Integer> inputList = Arrays.asList(input);
        for (Integer num : inputList){
            int target = 2020 - num;
            if (inputList.contains(target)) {
                int index = inputList.indexOf(target);
                return num * inputList.get(index);
            }

        }
        return 0;
    }
}
