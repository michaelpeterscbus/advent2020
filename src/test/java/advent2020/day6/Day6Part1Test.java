package advent2020.day6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day6Part1Test {
    private Day6Part1 subject;

    @BeforeEach
    void setup() {
        subject = new Day6Part1();
    }

    @Test
    void tryTestInput() throws IOException {
        assertThat(subject.sumYesAnswers("day6TestInput.txt")).isEqualTo(11);
    }

    @Test
    void calculateYesAnswersForActualInput() throws IOException {
        System.out.println(subject.sumYesAnswers("day6Input.txt"));
    }

}
