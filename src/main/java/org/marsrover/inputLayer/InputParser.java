package org.marsrover.inputLayer;

import org.marsrover.domain.CompassDirection;
import org.marsrover.domain.Instruction;
import org.marsrover.domain.PlateauSize;
import org.marsrover.domain.Position;

import java.util.ArrayList;
import java.util.List;

public class InputParser {

    public static PlateauSize parseStringToPlateauSize(String input) {
        String[] strings = input.split(" ");
        int x = Integer.parseInt(strings[0]);
        int y = Integer.parseInt(strings[1]);
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed.");
        }
        return new PlateauSize(x, y);
    }

    public static Position parseStringToPosition(String input) {
        String[] strings = input.split(" ");
        int x = Integer.parseInt(strings[0]);
        int y = Integer.parseInt(strings[1]);
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed.");
        }

        String inputDirection = strings[2].toUpperCase();
        if (!inputDirection.equals("N") && !inputDirection.equals("S") && !inputDirection.equals("E") && !inputDirection.equals("W")) {
            throw new IllegalArgumentException("Letter not valid. Allowed values : 'N','S','E','W'");
        }
        CompassDirection direction = CompassDirection.valueOf(inputDirection);

        return new Position(x, y, direction);
    }

    public static List<Instruction> parseStringToInstruction(String input) {
        List<Instruction> list = new ArrayList<>();
        char[] instructions = input.toCharArray();
//
        for (char instr : instructions) {
            if (instr != 'L' && instr != 'M' && instr != 'R') {
                throw new IllegalArgumentException("Letter not valid. Allowed values : 'L','R','M'.");
            }
            Instruction instruction = Instruction.valueOf(String.valueOf(instr));
            list.add(instruction);
        }


        return list;
    }


}
