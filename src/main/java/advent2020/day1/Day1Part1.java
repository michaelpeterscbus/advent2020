package advent2020.day1;

public class Day1Part1 {
    public int findAndMultiplyEntries(int[] input) {
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
}
