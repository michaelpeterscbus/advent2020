package advent2020.day1;

import advent2020.util.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day1Part2Test {
    private Day1Part2 subject;
    private TestUtils testUtils;

    @BeforeEach()
    void setup() {
        subject = new Day1Part2();
        testUtils = new TestUtils();
    }

    @Test
    void testExample() {
        int[] input = {1721,979,366,299,675,1546};
        assertThat(subject.findAndMultiplyEntries(input)).isEqualTo(241861950);
    }

    @Test
    void testActualInput() throws IOException {
        String[] inputString = testUtils.getInput("day1input.txt");
        int[] input = new int[inputString.length];
        for(int i = 0; i < inputString.length; i++){
            input[i] = Integer.parseInt(inputString[i]);
        }
        System.out.println(subject.findAndMultiplyEntries(input));
    }
}
