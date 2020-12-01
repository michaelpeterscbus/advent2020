package advent2020.day1;

public class Day1Part2 {
    public int findAndMultiplyEntries(int[] input) {
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
}
