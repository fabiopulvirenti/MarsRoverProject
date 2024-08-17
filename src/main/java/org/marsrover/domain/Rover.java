package org.marsrover.domain;

import java.util.List;

public class Rover {

    Engine engine;

    Position currentPosition;

    public Rover(Engine engine, Position currentPosition) {
        this.engine = engine;
        this.currentPosition = currentPosition;
    }

    public Position activateEngine(List<Instruction> instructionList){
        for(Instruction instr: instructionList) {
            if(instr.equals(Instruction.L)){
                Position newPosition = this.engine.rotateLeft(currentPosition);
                currentPosition =newPosition;
            } else if(instr.equals(Instruction.R)){
                Position newPosition = this.engine.rotateRight(currentPosition);
                currentPosition =newPosition;
            } else if(instr.equals(Instruction.M)){
                Position newPosition = this.engine.move(currentPosition);
                currentPosition =newPosition;
            }
        }
        return currentPosition;

    }



}
