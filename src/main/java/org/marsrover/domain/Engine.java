package org.marsrover.domain;

public class Engine {


    public Position move(Position position) {
        return null;
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
        return null;
    }


}
