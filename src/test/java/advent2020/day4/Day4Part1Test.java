package advent2020.day4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day4Part1Test {
    private Day4Part1 subject;

    @BeforeEach
    void setup() {
        subject = new Day4Part1();
    }

    @Test
    void testPassportInput() throws IOException {
        assertThat(subject.validatePassports("day4TestInput.txt")).isEqualTo(2);
    }

    @Test
    void actualPassportInput() throws IOException {
        System.out.println(subject.validatePassports("day4Input.txt"));
    }
}
