package advent2020.day8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day8Part1Test {
    private Day8Part1 subject;

    @BeforeEach
    void setup() {
        subject = new Day8Part1();
    }

    @Test
    void testInput() throws IOException {
        assertThat(subject.getAccumulatorValue("day8TestInput.txt")).isEqualTo(5);
    }

    @Test
    void runActualInput() throws IOException {
        System.out.println(subject.getAccumulatorValue("day8Input.txt"));
    }
}
