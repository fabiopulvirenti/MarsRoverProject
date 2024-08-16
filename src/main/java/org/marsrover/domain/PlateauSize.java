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

    @Override
    public String toString() {
        return "PlateauSize{" +
                "numRows=" + numRows +
                ", numCols=" + numCols +
                '}';
    }
}
