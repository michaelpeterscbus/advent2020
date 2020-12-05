package advent2020.day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day5Part1 {
    public int findMaxSeatId(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        int maxSeatId = 0;
        while ((input = br.readLine()) != null) {
            char[] characters = input.toCharArray();
            int currentSeatId = calculateSeatId(characters);
            if (currentSeatId > maxSeatId) {
                maxSeatId = currentSeatId;
            }
        }
        return maxSeatId;
    }

    public int calculateSeatId(char[] characters) {
        int beginRow = 0;
        int endRow = 127;
        int rowRange = 127;
        int beginColumn = 0;
        int endColumn = 7;
        int columnRange = 7;
        int row = 0;
        int column = 0;
        for (int i = 0; i < 6; i ++) {
            rowRange = rowRange / 2;
            if (characters[i] == 'F') {
                endRow -= rowRange + 1;
            } else {
                beginRow += rowRange + 1;
            }
        }
        if (characters[6] == 'F') {
            row = beginRow;
        } else {
            row = endRow;
        }
        for (int i = 7; i < 9; i++){
            columnRange = columnRange / 2;
            if (characters[i] == 'L') {
                endColumn -= columnRange + 1;
            } else {
                beginColumn += columnRange + 1;
            }
        }
        if (characters[9] == 'L') {
            column = beginColumn;
        } else {
            column = endColumn;
        }
        return row * 8 + column;
    }

}
