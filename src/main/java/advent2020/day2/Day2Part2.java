package advent2020.day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day2Part2 {

    public int validatePasswords(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        int countValidPasswords = 0;
        while ((input = br.readLine()) != null) {
            String[] inputLine = input.split("[- :]");
            PasswordPolicy passwordPolicy = createPasswordPolicy(inputLine);
            boolean hasMinMatch = false;
            boolean hasMaxMatch = false;
            for (int i = 0; i < passwordPolicy.getPassword().length(); i++) {
                if (i == passwordPolicy.getMin() - 1 && passwordPolicy.getPassword().charAt(i) == passwordPolicy.getCharacter()){
                    hasMinMatch = true;
                } else if (i == passwordPolicy.getMax() - 1 && passwordPolicy.getPassword().charAt(i) == passwordPolicy.getCharacter()){
                    hasMaxMatch = true;
                }
                if (hasMinMatch && hasMaxMatch){
                    break;
                }
            }
            if (hasMinMatch && !hasMaxMatch){
                countValidPasswords++;
            } else if (!hasMinMatch && hasMaxMatch){
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
