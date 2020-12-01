package advent2020.day1;

import java.util.Arrays;
import java.util.List;

public class Day1Part2 {
    public int findAndMultiplyEntries(Integer[] input) {
        for (int i = 0; i < input.length - 2; i++) {
            for (int j = 1; j < input.length - 1; j++) {
                for (int k = 2; k < input.length; k++) {
                    if (i != j && j != k && i != k) {
                        if (input[i] + input[j] + input[k] == 2020) {
                            return input[i] * input[j] * input[k];
                        }
                    }
                }
            }
        }
        return 0;
    }

    public int findAndMultiplyEntriesAlternate(Integer[] input){
        List<Integer> inputList = Arrays.asList(input);
        for (Integer numX : inputList) {
            for(Integer numY : inputList) {
                int target = 2020 - numX - numY;
                if (inputList.contains(target)){
                    return numX * numY * inputList.get(inputList.indexOf(target));
                }
            }
        }
        return 0;
    }
}
