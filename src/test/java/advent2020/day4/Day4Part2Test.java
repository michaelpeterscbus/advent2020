package advent2020.day4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day4Part2Test {
    private Day4Part2 subject;

    @BeforeEach
    void setup() {
        subject = new Day4Part2();
    }

    @Test
    void testSampleInvalidPassports() throws IOException {
        assertThat(subject.validatePassports("day4Invalid.txt")).isEqualTo(0);
    }

    @Test
    void testSampleValidPassports() throws IOException {
        assertThat(subject.validatePassports("day4Valid.txt")).isEqualTo(4);
    }

    @Test
    void actualPassportInput() throws IOException {
        System.out.println(subject.validatePassports("day4Input.txt"));
    }
}
