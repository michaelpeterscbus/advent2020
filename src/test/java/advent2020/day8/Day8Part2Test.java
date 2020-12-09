package advent2020.day8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day8Part2Test {
    private Day8Part2 subject;

    @BeforeEach
    void setup() {
        subject = new Day8Part2();
    }

    @Test
    void testInput() throws IOException {
        assertThat(subject.getAccumulatorValue("day8TestInput.txt")).isEqualTo(8);
    }

    @Test
    void runActualInput() throws IOException {
        System.out.println(subject.getAccumulatorValue("day8Input.txt"));
    }
}
