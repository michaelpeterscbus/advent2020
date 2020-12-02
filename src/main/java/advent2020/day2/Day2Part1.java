package advent2020.day2;

import java.io.*;
import java.nio.file.Files;

public class Day2Part1 {
    public int validatePasswords(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        int countValidPasswords = 0;
        while ((input = br.readLine()) != null) {
            String[] inputLine = input.split("[- :]");
            PasswordPolicy passwordPolicy = createPasswordPolicy(inputLine);
            int countRequiredCharacter = 0;
            for (int i = 0; i < passwordPolicy.getPassword().length(); i++) {
                if (passwordPolicy.getPassword().charAt(i) == passwordPolicy.getCharacter()) {
                    countRequiredCharacter++;
                }
            }
            if (countRequiredCharacter >= passwordPolicy.getMin() && countRequiredCharacter <= passwordPolicy.getMax()) {
                countValidPasswords++;
            }
        }
        System.out.println(countValidPasswords);
        return countValidPasswords;
    }


    private PasswordPolicy createPasswordPolicy(String[] inputLine) {
        PasswordPolicy passwordPolicy = new PasswordPolicy();
        passwordPolicy.setMin(Integer.parseInt(inputLine[0]));
        passwordPolicy.setMax(Integer.parseInt(inputLine[1]));
        passwordPolicy.setCharacter(inputLine[2].charAt(0));
        passwordPolicy.setPassword(inputLine[4]);
        return passwordPolicy;
    }
}
