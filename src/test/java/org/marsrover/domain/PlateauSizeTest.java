package org.marsrover.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateauSizeTest {

    @Test
    void isWithinBorders() {
        PlateauSize plateauSize= new PlateauSize(5,5);

        assertTrue(plateauSize.isWithinBorders(new Position(4,4,CompassDirection.N)));
        assertTrue(plateauSize.isWithinBorders(new Position(0,0,CompassDirection.N)));
        assertTrue(plateauSize.isWithinBorders(new Position(2,3,CompassDirection.N)));
        assertTrue(plateauSize.isWithinBorders(new Position(5,5,CompassDirection.N)));


        assertFalse(plateauSize.isWithinBorders(new Position(5,6,CompassDirection.N)));
        assertFalse(plateauSize.isWithinBorders(new Position(5,-1,CompassDirection.S)));
        assertFalse(plateauSize.isWithinBorders(new Position(6,3,CompassDirection.N)));
        assertFalse(plateauSize.isWithinBorders(new Position(-3,3,CompassDirection.N)));
    }
}