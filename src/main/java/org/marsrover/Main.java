package org.marsrover;

import org.marsrover.domain.MarsRoverGame;

public class Main {
    public static void main(String[] args) {

        MarsRoverGame game = new MarsRoverGame();
        game.takeInputFromUser();


//        List<String> input = new ArrayList<>();
//        input.add("5 5");
//        input.add("1 2 N");
//        input.add("LMLMLMLMM");
//        input.add("3 3 E");
//        input.add("MMRMMRMRRM");
//        Rover rover = new Rover();
//        rover.activateEngine(instructionList);
//

//        PlateauSize plateauSize= InputParser.parseStringToPlateauSize(input.get(0));
//        Position position = InputParser.parseStringToPosition(input.get(1));
//        List<Instruction> instructionList =InputParser.parseStringToInstruction(input.get(2));
//        Position position2 = InputParser.parseStringToPosition(input.get(3));
//        List<Instruction> instructionList2 =InputParser.parseStringToInstruction(input.get(4));
//
//        MissionControl missionControl=new MissionControl();
//        missionControl.createPlateau(plateauSize);
//
//        Position finalPosition1 =missionControl.startMission(position,instructionList);
//        System.out.println(finalPosition1);
//
//        Position finalPosition2 =missionControl.startMission(position2,instructionList2);
//        System.out.println(finalPosition2);
//
//
//        System.out.println(plateauSize);
//        System.out.println(position);
//        System.out.println(instructionList);


    }
}