package advent2020.day9;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day9Part1Test {

    private Day9Part1 subject;

    @BeforeEach
    void setup() {
        subject = new Day9Part1();
    }

    @Test
    void testInput() throws IOException {
        assertThat(subject.findFirstInvalid("day9TestInput.txt")).isEqualTo(100);
    }

    @Test
    void runActualInput() throws IOException {
        System.out.println(subject.findFirstInvalid("day9Input.txt"));
    }
}
