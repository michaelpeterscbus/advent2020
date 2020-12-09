package advent2020.day8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day8Part2 {
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

        boolean loopIsFixed = false;
        boolean jmpToNop = true;
        int lastChanged = 0;
        int workingAccumulator = 0;
        while(!loopIsFixed) {
            Set<Integer> usedInstructions = new HashSet<>();
            int accumulator = 0;
            if (lastChanged != 0 && jmpToNop) {
                instructions.get(lastChanged).setOperation("jmp");
            }
            for (int i = lastChanged + 1; i < instructions.size(); i++){
                if (jmpToNop && instructions.get(i).getOperation().equals("jmp") ) {
                    instructions.get(i).setOperation("nop");
                    lastChanged = i;
                    if (lastChanged == instructions.size() - 1) {
                        jmpToNop = false;
                    }
                    break;
                }

            }
            for (int i = 0; i < instructions.size(); i++) {
                if (!usedInstructions.add(i)) {
                    break;
                }
                String operation = instructions.get(i).getOperation();
                if (operation.equals("acc")) {
                    accumulator += instructions.get(i).getArgument();
                } else if (operation.equals("jmp")) {
                    i = i + instructions.get(i).getArgument() - 1;
                }
                if (i == instructions.size() - 1) {
                    loopIsFixed = true;
                }
            }
            workingAccumulator = accumulator;
        }
        return workingAccumulator;
    }
}
