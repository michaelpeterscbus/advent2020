package advent2020.day3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day3Part2Test {
    private Day3Part2 subject;

    @BeforeEach()
    void setup() {
        subject = new Day3Part2();
    }

    @Test
    public void checkSlopeForOriginal() throws IOException {
        assertThat(subject.checkTheSlope("day3TestInput.txt",3,1)).isEqualTo(7);
    }

    @Test
    public void tobogganTestInput() throws IOException {
        assertThat(subject.toboggan("day3TestInput.txt")).isEqualTo(336);
    }

    @Test
    public void tabogganWithActualInput() throws IOException {
        System.out.println(subject.toboggan("day3Input.txt"));
    }

}
