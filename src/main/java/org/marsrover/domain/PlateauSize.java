package org.marsrover.domain;

public class PlateauSize {

 private int numRows;

 private int numCols;

    public PlateauSize(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public boolean isWithinBorders(Position position) {
        if (position.getX() >= this.numRows || position.getY() >= this.numCols) {
            return false;
        } else if (position.getX() < 0 || position.getY() < 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "PlateauSize{" +
                "numRows=" + numRows +
                ", numCols=" + numCols +
                '}';
    }
}
