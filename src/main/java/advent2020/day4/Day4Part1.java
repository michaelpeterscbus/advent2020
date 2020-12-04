package advent2020.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Day4Part1 {

    public int validatePassports(String fileName) throws IOException {
        String[] requiredFields = {"byr","iyr","eyr","hgt","hcl","ecl","pid"};
        Path path = Paths.get("src/test/resources/" + fileName);
        String input = Files.readString(path);
        String[] passportsArray = input.split("\n\n");
        int validPassports = 0;
        for (String passportStr : passportsArray) {
            Map<String,String> passportMap = new HashMap<>();
            String[] data = passportStr.split("[\n: ]");
            for (int i = 0; i < data.length; i+=2){
                passportMap.put(data[i], data[i+1]);
            }
            boolean isValid = true;
            for(int i = 0; i < requiredFields.length; i++){
                if (!passportMap.containsKey(requiredFields[i])){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                validPassports++;
            }
        }
        return validPassports;
    }
}
