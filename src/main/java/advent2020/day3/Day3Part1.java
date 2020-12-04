package advent2020.day3;

import java.io.*;

public class Day3Part1 {
    public int toboggan(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        int position = 3;
        int numTrees = 0;
        br.readLine();
        while ((input = br.readLine()) != null) {
            if (position >= input.length()) {
                position = position - input.length();
            }
            if (input.charAt(position) == '#'){
                numTrees++;
            }
            position += 3;
        }
        return numTrees;
    }
}
