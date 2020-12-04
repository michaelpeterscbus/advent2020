package advent2020.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day3Part2 {
    public int toboggan(String fileName) throws IOException {
        int slope1 = checkTheSlope(fileName,1,1);
        int slope2 = checkTheSlope(fileName,3,1);
        int slope3 = checkTheSlope(fileName,5,1);
        int slope4 = checkTheSlope(fileName,7,1);
        int slope5 = checkTheSlope(fileName,1,2);
        return slope1 * slope2 * slope3 * slope4 * slope5;


    }

    public int checkTheSlope(String fileName, int right, int down) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        int position = right;
        int numTrees = 0;
        for(int i = 0; i < down; i++){
            br.readLine();
        }
        while ((input = br.readLine()) != null) {
            if (position >= input.length()) {
                position = position - input.length();
            }
            if (input.charAt(position) == '#'){
                numTrees++;
            }
            position += right;
            if(down > 1){
                for (int i = 1; i < down; i++ ){
                    br.readLine();
                }
            }
        }
        return numTrees;
    }
}
