package org.marsrover.logicLayer;

import org.marsrover.domain.*;

import java.util.List;

public class MissionControl {
    private Plateau plateau;
//    private List<Rover> roverList =new ArrayList<>();

    public void createPlateau(PlateauSize plateauSize) {
        plateau = new Plateau(plateauSize);
    }

//    public List<Rover> getRoverList() {
//        return roverList;
//    }

    public Position startMission(Position initialPosition, List<Instruction> instructionList) {

        Engine engine = new Engine(plateau.getPlateauSize());
        Rover rover = new Rover(engine, initialPosition);
        this.plateau.getRoverList().add(rover);
//       roverList.add(rover);

        Position finalPosition = rover.activateEngine(instructionList);

        return finalPosition;


    }

}
