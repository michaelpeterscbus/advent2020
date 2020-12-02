package advent2020.day2;

import lombok.Data;

@Data
public class PasswordPolicy {
    private int min;
    private int max;
    private char character;
    private String password;
}
