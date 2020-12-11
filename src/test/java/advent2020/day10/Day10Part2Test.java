package advent2020.day10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day10Part2Test {
    private Day10Part2 subject;

    @BeforeEach
    void setup() {
        subject = new Day10Part2();
    }

    @Test
    void testInput() throws IOException {
        assertThat(subject.calculateJoltage("day10TestInput.txt")).isEqualTo(8);
    }

    @Test
    void testInput2() throws IOException {
        assertThat(subject.calculateJoltage("day10TestInput2.txt")).isEqualTo(19208);
    }

    @Test
    void runActualInput() throws IOException {
        System.out.println(subject.calculateJoltage("day10Input.txt"));
    }
}
