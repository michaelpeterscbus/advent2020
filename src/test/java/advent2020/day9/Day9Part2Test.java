package advent2020.day9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day9Part2Test {

    private Day9Part2 subject;

    @BeforeEach
    void setup() {
        subject = new Day9Part2();
    }

    @Test
    void testInput() throws IOException {
        assertThat(subject.findEncryptionWeakness(127,"day9TestInput2.txt")).isEqualTo(62);
    }

    @Test
    void runActualInput() throws IOException {
        System.out.println(subject.findEncryptionWeakness(20874512,"day9Input.txt"));
    }
}
