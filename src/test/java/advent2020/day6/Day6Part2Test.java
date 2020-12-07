package advent2020.day6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day6Part2Test {
    private Day6Part2 subject;

    @BeforeEach
    void setup() {
        subject = new Day6Part2();
    }

    @Test
    void tryTestInput() throws IOException {
        assertThat(subject.sumGroupAnswers("day6TestInput.txt")).isEqualTo(6);
    }

    @Test
    void calculateYesAnswersForActualInput() throws IOException {
        System.out.println(subject.sumGroupAnswers("day6Input.txt"));
    }

}
