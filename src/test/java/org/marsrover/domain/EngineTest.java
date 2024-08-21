package org.marsrover.domain;

import org.junit.jupiter.api.Test;
import org.marsrover.logicLayer.Engine;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    void testMove() {

        PlateauSize newPlateauSize =new PlateauSize(5,5);
        Engine engine =new Engine(newPlateauSize);
        Position newPosition = engine.move(new Position(2,4,CompassDirection.E));
        assertNotNull(newPosition);
        assertEquals(3,newPosition.getX());
        assertEquals(4,newPosition.getY());
        assertEquals(CompassDirection.E,newPosition.getFacing());

        Position newPosition2 =engine.move(new Position(1,1,CompassDirection.N));
        assertNotNull(newPosition2);
        assertEquals(1,newPosition2.getX());
        assertEquals(2,newPosition2.getY());
        assertEquals(CompassDirection.N,newPosition2.getFacing());

        Position newPosition3=engine.move(new Position(3,2,CompassDirection.S));
        assertNotNull(newPosition3);
        assertEquals(3,newPosition3.getX());
        assertEquals(1,newPosition3.getY());
        assertEquals(CompassDirection.S,newPosition3.getFacing());

        Position newPosition4=engine.move(new Position(3,2,CompassDirection.E));
        assertNotNull(newPosition4);
        assertEquals(4,newPosition4.getX());
        assertEquals(2,newPosition4.getY());
        assertEquals(CompassDirection.E,newPosition4.getFacing());

        boolean thrown = false;
        try {
            Position newPosition5 = engine.move(new Position(2,5,CompassDirection.N));
        }catch(IllegalArgumentException e){
            assertEquals("Position out of bound.",e.getMessage());
            thrown =true;
        }
        assertTrue(thrown);


        boolean thrown2 = false;
        try {
            Position newPosition6 = engine.move(new Position(5,5,CompassDirection.N));
        }catch(IllegalArgumentException e){
            assertEquals("Position out of bound.",e.getMessage());
            thrown2 =true;
        }
        assertTrue(thrown2);



    }

    @Test
    void testRotateLeft() {


        PlateauSize newPlateauSize =new PlateauSize(5,5);
        Engine engine =new Engine(newPlateauSize);
        Position newPosition =engine.rotateLeft(new Position(2,4,CompassDirection.N));
        assertNotNull(newPosition);
        assertEquals(2,newPosition.getX());
        assertEquals(4,newPosition.getY());
        assertEquals(CompassDirection.W,newPosition.getFacing());

        Position newPosition2 =engine.rotateLeft(new Position(2,4,CompassDirection.W));
        assertNotNull(newPosition2);
        assertEquals(CompassDirection.S,newPosition2.getFacing());

        Position newPosition3 =engine.rotateLeft(new Position(2,4,CompassDirection.S));
        assertNotNull(newPosition3);
        assertEquals(CompassDirection.E,newPosition3.getFacing());

        Position newPosition4 =engine.rotateLeft(new Position(2,4,CompassDirection.E));
        assertNotNull(newPosition4);
        assertEquals(CompassDirection.N,newPosition4.getFacing());



    }

    @Test
    void testRotateRight() {

        PlateauSize newPlateauSize =new PlateauSize(5,5);
        Engine engine =new Engine(newPlateauSize);

        Position newPosition=engine.rotateRight(new Position(2,3,CompassDirection.N));
        assertNotNull(newPosition);
        assertEquals(2,newPosition.getX());
        assertEquals(3,newPosition.getY());
        assertEquals(CompassDirection.E,newPosition.getFacing());

        Position newPosition2 =engine.rotateRight(new Position(2,3,CompassDirection.E));
        assertNotNull(newPosition2);
        assertEquals(CompassDirection.S,newPosition2.getFacing());

        Position newPosition3 =engine.rotateRight(new Position(2,3,CompassDirection.S));
        assertNotNull(newPosition3);
        assertEquals(CompassDirection.W,newPosition3.getFacing());

        Position newPosition4 =engine.rotateRight(new Position(2,3,CompassDirection.W));
        assertNotNull(newPosition4);
        assertEquals(CompassDirection.N,newPosition4.getFacing());




    }
}