package org.marsrover.domain;

import org.marsrover.logicLayer.Rover;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private final PlateauSize plateauSize;
    private final List<Rover> roverList = new ArrayList<>();

    public Plateau(PlateauSize plateauSize) {
        this.plateauSize = plateauSize;
    }

    public PlateauSize getPlateauSize() {
        return plateauSize;
    }

    public List<Rover> getRoverList() {
        return roverList;
    }
}
