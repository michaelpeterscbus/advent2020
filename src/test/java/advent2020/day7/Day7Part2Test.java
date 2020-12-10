package advent2020.day7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day7Part2Test {
    private Day7Part2 subject;

    @BeforeEach
    void setup() {
        subject = new Day7Part2();
    }

    @Test
    void testInput() throws IOException {
        assertThat(subject.getBags("day7TestInput.txt")).isEqualTo(32);
    }

    @Test
    void testInput2() throws IOException {
        assertThat(subject.getBags("day7TestInput2.txt")).isEqualTo(126);
    }

    @Test
    void runActualInput() throws IOException {
        System.out.println(subject.getBags("day7Input.txt"));
    }
}
