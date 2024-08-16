package org.marsrover;

import org.marsrover.domain.PlateauSize;
import org.marsrover.domain.Position;
import org.marsrover.domain.Rover;
import org.marsrover.inputLayer.InputParser;
import org.marsrover.domain.Instruction;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PlateauSize plateauSize= InputParser.parseStringToPlateauSize("5 5");
        Position position = InputParser.parseStringToPosition("1 2 N");
        List<Instruction> instructionList =InputParser.parseStringToInstruction("LMLMMMLLMMMR");

//        Rover rover = new Rover();
//        rover.activateEngine(instructionList);
//

        System.out.println(plateauSize);
        System.out.println(position);
        System.out.println(instructionList);


    }
}