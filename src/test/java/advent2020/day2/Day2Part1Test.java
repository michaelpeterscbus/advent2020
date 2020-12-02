package advent2020.day2;

import advent2020.util.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day2Part1Test {
    private Day2Part1 subject;
    private TestUtils testUtils;

    @BeforeEach()
    void setup() {
        subject = new Day2Part1();
        testUtils = new TestUtils();
    }

    @Test
    void validatePasswordsWorksForTestInput() throws IOException {
        assertThat(subject.validatePasswords("day2TestInput.txt")).isEqualTo(2);
    }

    @Test
    void validatePasswordsForActualInput() throws IOException {
        subject.validatePasswords("day2Input.txt");
    }
}
