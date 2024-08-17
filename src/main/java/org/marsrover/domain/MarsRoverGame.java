package org.marsrover.domain;

import org.marsrover.inputLayer.InputParser;

import java.util.List;
import java.util.Scanner;

public class MarsRoverGame {


    public void takeInputFromUser(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Insert Plateau size (ex: 5 5): ");
        String plateauSizeStr= scanner.nextLine();
        MissionControl missionControl=new MissionControl();

        PlateauSize plateauSize= InputParser.parseStringToPlateauSize(plateauSizeStr);
        missionControl.createPlateau(plateauSize);


        while(true) {
            System.out.print("Insert initial position (ex: 2 3 N): ");
            String initialPositionStr = scanner.nextLine();
            Position position = InputParser.parseStringToPosition(initialPositionStr);
            System.out.print("Insert the instructions (ex: LMR): ");
            String instructionsStr = scanner.nextLine();
            List<Instruction> instructionList =InputParser.parseStringToInstruction(instructionsStr);

            try {
                Position finalPosition = missionControl.startMission(position, instructionList);
                System.out.printf("The final position of the Rover is: %s", finalPosition.toString());
            } catch (IllegalArgumentException e) {
                System.out.printf("Error occurred when executing your instructions. I am sorry your Rover got stuck. Error: %s",  e.getMessage());
            }

            System.out.println("");
            System.out.println("");

            System.out.println("Do you want to add more Rovers to the mission? [yes/no]");
            String answer = scanner.nextLine();
            if(answer.equals("yes")){
                continue;
            } else{
                break;
            }

        }










    }








}
