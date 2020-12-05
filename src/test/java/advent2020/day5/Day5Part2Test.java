package advent2020.day5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Day5Part2Test {
    private Day5Part2 subject;

    @BeforeEach
    void setup() {
        subject = new Day5Part2();
    }

    @Test
    void getMaxSeatIdFromActualInput() throws IOException {
        System.out.println(subject.findMySeatId("day5Input.txt"));
    }
}
