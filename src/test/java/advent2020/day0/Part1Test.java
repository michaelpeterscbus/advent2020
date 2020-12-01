package advent2020.day0;

import advent2020.util.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Part1Test {
    private Part1 subject;
    private TestUtils testUtils;

    @BeforeEach()
    void setup() {
        subject = new Part1();
        testUtils = new TestUtils();
    }

    @Test
    void massOf12() {
        assertThat(subject.calculateFuel(12)).isEqualTo(2);
    }

    @Test
    void massOf14() {
        assertThat(subject.calculateFuel(14)).isEqualTo(2);
    }

    @Test
    void massOf1969() {
        assertThat(subject.calculateFuel(1969)).isEqualTo(654);
    }

    @Test
    void massOf100756() {
        assertThat(subject.calculateFuel(100756)).isEqualTo(33583);
    }

    @Test
    void testActualInput() throws IOException {
        String[] inputList = testUtils.getInput("day0input.txt");
        int sum = 0;
        for (String mass : inputList) {
            sum += subject.calculateFuel(Integer.parseInt(mass));
        }
        System.out.println(sum);
    }
}
