package org.marsrover.domain;

public class Engine {

    PlateauSize plateauSize;

    public Engine(PlateauSize plateauSize) {
        this.plateauSize = plateauSize;
    }

    public Position move(Position position) {


        Position newPosition;
        if(position.getFacing().equals(CompassDirection.E)){
            newPosition= new Position(position.getX() +1, position.getY(), CompassDirection.E);
        } else if(position.getFacing().equals(CompassDirection.S)){
            newPosition = new Position(position.getX(), position.getY() -1, CompassDirection.S);
        } else if(position.getFacing().equals(CompassDirection.W)){
            newPosition = new Position(position.getX()-1, position.getY(), CompassDirection.W);
        }else{
            newPosition= new Position(position.getX(), position.getY() +1 , CompassDirection.N);
        }

        if(plateauSize.isWithinBorders(newPosition)){
            return newPosition;
            } else {
                throw new IllegalArgumentException("Position out of bound.");
            }
    }


    public Position rotateLeft(Position position) {
        CompassDirection currentFacing = position.getFacing();

        CompassDirection newFacing;

        if (currentFacing.equals(CompassDirection.N)) {
            newFacing = CompassDirection.W;
        } else if (currentFacing.equals(CompassDirection.W)) {
            newFacing = CompassDirection.S;
        } else if (currentFacing.equals(CompassDirection.S)) {
            newFacing = CompassDirection.E;
        } else {
            newFacing = CompassDirection.N;
        }

        Position newPosition = new Position(position.getX(), position.getY(), newFacing);


        return newPosition;
    }

    public Position rotateRight(Position position) {
        CompassDirection currentFacing = position.getFacing();

        CompassDirection newFacing;

        if (currentFacing.equals(CompassDirection.N)) {
            newFacing = CompassDirection.E;
        } else if (currentFacing.equals(CompassDirection.E)) {
            newFacing = CompassDirection.S;
        } else if (currentFacing.equals(CompassDirection.S)) {
            newFacing = CompassDirection.W;
        } else {
            newFacing = CompassDirection.N;
        }


        Position newPosition = new Position(position.getX(), position.getY(), newFacing);

        return newPosition;
    }


}
