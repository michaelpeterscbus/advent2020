package advent2020.day8;

import java.io.*;
import java.util.*;

public class Day8Part1 {
    public int getAccumulatorValue(String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String input;
        List<Instruction> instructions = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            Instruction instruction = new Instruction();
            instruction.setOperation(input.substring(0,3));
            instruction.setArgument(Integer.parseInt(input.substring(4)));
            instructions.add(instruction);
        }
        Set<Integer> usedInstructions = new HashSet<>();
        int accumulator = 0;
        for (int i = 0; i < instructions.size(); i++){
            if(!usedInstructions.add(i)){
                break;
            }
            String operation = instructions.get(i).getOperation();
            if (operation.equals("acc")){
                accumulator += instructions.get(i).getArgument();
            } else if (operation.equals("jmp")){
                i = i + instructions.get(i).getArgument() - 1;
            }
        }
        return accumulator;
    }
}
