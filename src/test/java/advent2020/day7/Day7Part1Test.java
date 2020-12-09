package advent2020.day7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day7Part1Test {
    private Day7Part1 subject;

    @BeforeEach
    void setup() {
        subject = new Day7Part1();
    }

    @Test
    void testInput() throws IOException {
        assertThat(subject.getBags("day7TestInput.txt")).isEqualTo(4);
    }
}
