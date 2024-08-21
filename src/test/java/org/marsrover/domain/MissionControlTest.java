package org.marsrover.domain;

import org.junit.jupiter.api.Test;
import org.marsrover.logicLayer.MissionControl;
import org.marsrover.inputLayer.InputParser;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MissionControlTest {

    @Test
    void startMission() {

        List<String> input = new ArrayList<>();
        input.add("5 5");
        input.add("1 2 N");
        input.add("LMLMLMLMM");
        input.add("3 3 E");
        input.add("MMRMMRMRRM");



        PlateauSize plateauSize= InputParser.parseStringToPlateauSize(input.get(0));
        Position position = InputParser.parseStringToPosition(input.get(1));
        List<Instruction> instructionList =InputParser.parseStringToInstruction(input.get(2));
        Position position2 = InputParser.parseStringToPosition(input.get(3));
        List<Instruction> instructionList2 =InputParser.parseStringToInstruction(input.get(4));

        MissionControl missionControl=new MissionControl();
        missionControl.createPlateau(plateauSize);

        Position finalPosition1 =missionControl.startMission(position,instructionList);


        Position finalPosition2 =missionControl.startMission(position2,instructionList2);

        assertEquals(new Position(1,3,CompassDirection.N) ,finalPosition1);
        assertEquals(new Position(5,1,CompassDirection.E) ,finalPosition2);





    }
}