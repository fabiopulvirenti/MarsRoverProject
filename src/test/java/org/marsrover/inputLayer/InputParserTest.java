package org.marsrover.inputLayer;

import org.junit.jupiter.api.Test;
import org.marsrover.domain.CompassDirection;
import org.marsrover.domain.Instruction;
import org.marsrover.domain.PlateauSize;
import org.marsrover.domain.Position;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void testParseStringToPlateauSize() {
        PlateauSize plateauSize= InputParser.parseStringToPlateauSize("5 5");
        assertEquals(5,plateauSize.getNumRows());
        assertEquals(5,plateauSize.getNumCols());


        PlateauSize plateauSize2= InputParser.parseStringToPlateauSize("4 3");
        assertEquals(4,plateauSize2.getNumRows());
        assertEquals(3,plateauSize2.getNumCols());

        //TODO: find a way to test negative inputs
        boolean thrown =false;
        try{
            PlateauSize plateauSize3= InputParser.parseStringToPlateauSize("-3 -4");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            thrown=true;
        }
        assertTrue(thrown);



    }

    @Test
    void testParseStringToPosition() {
        Position position = InputParser.parseStringToPosition("1 2 N");
        assertEquals(1,position.getX());
        assertEquals(2,position.getY());
        assertEquals(CompassDirection.N,position.getFacing());


        boolean thrown = false;
        try{
            Position position2 = InputParser.parseStringToPosition("-1 2 N");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            thrown = true;
        }
        assertTrue(thrown);

       boolean thrown2 = false;
       try{
           Position position3 = InputParser.parseStringToPosition("1 -2 N");
       } catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
           thrown2 =true;
       }
       assertTrue(thrown2);

//       boolean thrown3 = false;
//       try{
//           Position position4 = InputParser.parseStringToPosition("1 2 A");
//           position4.getFacing();
//       } catch (IllegalArgumentException e) {
//           System.out.println();
//           thrown3= true;
//       }
//       assertTrue(thrown3);

        IllegalArgumentException thrown3=assertThrows(IllegalArgumentException.class,()->InputParser.parseStringToPosition("1 2 A"));
        assertEquals("Letter not valid. Allowed values : 'N','S','E','W'",thrown3.getMessage());

//
//
//
    }

    @Test
    void testParseStringToInstruction() {
        List<Instruction> instructionList = InputParser.parseStringToInstruction("LMLMMMLLMMMR");
        assertFalse(instructionList.isEmpty());
        assertEquals(Instruction.L, instructionList.getFirst());
        assertEquals(Instruction.R, instructionList.getLast());
        assertEquals(12, instructionList.size());


        List<Instruction> instructionList2 = InputParser.parseStringToInstruction("");
        assertTrue(instructionList2.isEmpty());

        //TODO: find a way to test an input that does not contain LMR
        boolean thrown = false;
        try {
            List<Instruction> instructionList3 = InputParser.parseStringToInstruction("A");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            thrown =true;
        }
        assertTrue(thrown);
    }
} // coming soon I am at the toilet