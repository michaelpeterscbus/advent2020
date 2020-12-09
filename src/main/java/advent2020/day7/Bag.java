package advent2020.day7;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Bag {
    private String color;
    private Map<String,Integer> content;
}
