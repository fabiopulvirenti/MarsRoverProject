package org.marsrover.domain;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private PlateauSize plateauSize;
    private List<Rover> roverList =new ArrayList<>();

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
