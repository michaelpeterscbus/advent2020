package advent2020.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Day4Part2 {

    public int validatePassports(String fileName) throws IOException {
        String[] requiredFields = {"byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"};
        Path path = Paths.get("src/test/resources/" + fileName);
        String input = Files.readString(path);
        String[] passportsArray = input.split("\n\n");
        int validPassports = 0;
        for (String passportStr : passportsArray) {
            Map<String, String> passportMap = new HashMap<>();
            String[] data = passportStr.split("[\n: ]");
            for (int i = 0; i < data.length; i += 2) {
                passportMap.put(data[i], data[i + 1]);
            }
            boolean isValid = true;
            for (int i = 0; i < requiredFields.length; i++) {
                String key = requiredFields[i];
                if (!passportMap.containsKey(key)) {
                    isValid = false;
                    break;
                } else {
                    String value = passportMap.get(key);
                    switch (key) {
                        case "byr":
                            int birthYear = Integer.parseInt(value);
                            if (birthYear < 1920 || birthYear > 2002) {
                                isValid = false;
                            }
                            break;
                        case "iyr":
                            int issueYear = Integer.parseInt(value);
                            if (issueYear < 2010 || issueYear > 2020) {
                                isValid = false;
                            }
                            break;
                        case "eyr":
                            int expYear = Integer.parseInt(value);
                            if (expYear < 2020 || expYear > 2030) {
                                isValid = false;
                            }
                            break;
                        case "hgt":
                            String units = value.substring(value.length() - 2);
                            if (!units.equals("cm") && !units.equals("in")) {
                                isValid = false;
                            } else {
                                int height = Integer.parseInt(value.substring(0, value.length() - 2));
                                if (units.equals("cm")) {
                                    if (height < 150 || height > 193) {
                                        isValid = false;
                                    }
                                } else if (units.equals("in")) {
                                    if (height < 59 || height > 76) {
                                        isValid = false;
                                    }
                                }
                            }
                            break;
                        case "hcl":
                            if (value.charAt(0) != '#') {
                                isValid = false;
                            } else {
                                if (!value.substring(1).matches("[a-f0-9]+")) {
                                    isValid = false;
                                }
                            }
                            break;
                        case "ecl":
                            List<String> eyeColors = Arrays.asList("amb", "blu", "brn", "gry", "grn", "hzl", "oth");
                            if (!eyeColors.contains(value)) {
                                isValid = false;
                            }
                            break;
                        case "pid":
                            if (value.length() != 9) {
                                isValid = false;
                            }
                    }
                }
            }
            if (isValid) {
                validPassports++;
            }
        }
        return validPassports;
    }
}
