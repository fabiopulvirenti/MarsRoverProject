package org.marsrover.domain;

import java.util.List;

public class MissionControl {

    private Plateau plateau;

    public void createPlateau(PlateauSize plateauSize){
        plateau = new Plateau(plateauSize);
    }



   public void startMission(Position initialPosition, List<Instruction> instructionList){

       Engine engine = new Engine(plateau.getPlateauSize());
       Rover rover =new Rover();

       rover.activateEngine(instructionList);


   }


}
