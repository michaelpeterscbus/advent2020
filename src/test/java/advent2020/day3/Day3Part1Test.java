package advent2020.day3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day3Part1Test {
    private Day3Part1 subject;

    @BeforeEach()
    void setup() {
        subject = new Day3Part1();
    }

    @Test
    public void tabogganTest() throws IOException {
        assertThat(subject.toboggan("day3TestInput.txt")).isEqualTo(7);
    }

    @Test
    public void tabogganWithActualInput() throws IOException {
        System.out.println(subject.toboggan("day3Input.txt"));
    }

}
