package advent2020.day5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day5Part1Test {
    private Day5Part1 subject;

    @BeforeEach
    void setup() {
        subject = new Day5Part1();
    }

    @Test
    void testCalculateSeat() {
        char[] characters = {'F','B','F','B','B','F','F','R','L','R'};

        int seatId = subject.calculateSeatId(characters);

        assertThat(seatId).isEqualTo(357);
    }

    @Test
    void testCalculateSeat2() {
        char[] characters = {'B','F','F','F','B','B','F','R','R','R'};

        int seatId = subject.calculateSeatId(characters);

        assertThat(seatId).isEqualTo(567);
    }

    @Test
    void getMaxSeatIdFromActualInput() throws IOException {
        System.out.println(subject.findMaxSeatId("day5Input.txt"));
    }
}
