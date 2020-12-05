package advent2020.day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day5Part2 {
    public int findMySeatId(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        List<Integer> seatIdList = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            char[] characters = input.toCharArray();
            int currentSeatId = calculateSeatId(characters);
            seatIdList.add(currentSeatId);
        }
        int mySeatId = 0;
        Collections.sort(seatIdList);
        int firstSeatId = seatIdList.get(0);
        int lastSeatId = seatIdList.get(seatIdList.size() - 1);
        for (int i = firstSeatId; i <= lastSeatId; i++) {
            if (!seatIdList.contains(i) && seatIdList.contains(i - 1) && seatIdList.contains(i + 1)) {
                mySeatId = i;
                break;
            }
        }
        return mySeatId;
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
