package Exercises;

import java.util.Scanner;
import java.util.Random;
public class RockPAperScissor {
    public static void main(String []args) {
        short loop = 3;
        short i = 0;
        short yourCounter = 0;
        short compCounter = 0;
        short draw = 0;
        while(i<5) {
        System.out.println("U have entered in the game please make a choice \n 0. for rock \n 1. for paper \n 2. scissors");
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        byte choice = sc.nextByte();

        byte compRandom = (byte)rn.nextInt(2);
        switch (choice) {
            case 0:
                if (compRandom == 0) {
                    System.out.println("draw \n computer also selected: rock");
                    draw++;
                } else if (compRandom == 1) {
                    System.out.println("you lost! \n computer selected: paper");
                    compRandom++;
                } else {
                    System.out.println("you won! \n computer selected: scissors");
                    yourCounter++;
                }
                break;
            case 1:
                if (compRandom == 1) {
                    System.out.println("draw! \ncomputer also selected: paper");
                    draw++;
                } else if (compRandom == 0) {
                    System.out.println("you win! \ncomputer selected: rock");
                    yourCounter++;
                } else {
                    System.out.println("you lose! \ncomputer selected: scissors");
                    compCounter++;
                }
                break;
            case 2:
                if (compRandom == 2) {
                    System.out.println("draw \n computer also selected: scissors");
                    draw++;
                } else if (compRandom == 1) {
                    System.out.println("you won! \n computer selected: paper");
                    yourCounter++;
                } else {
                    System.out.println("you lost! \n computer selected: rock");
                    compCounter++;
                }
                break;
            default:
                System.out.println("Invalid input entered");
        }
        i++;
        }
        if(yourCounter > compCounter){
           System.out.println("Result is: \n you win = " + yourCounter + " , " + "comp win = " + compCounter + " , " +
                   "draw = " + draw);
            System.out.println("you win the context by: " + yourCounter + "-" + compCounter );
        }
        else if(yourCounter < compCounter){
           System.out.println("Result is: \n you win = " + yourCounter + " , " + "comp win = " + compCounter + " , " +
                   "draw = " + draw);
            System.out.println("Computer win the context by: " + compCounter + "-" + yourCounter);
        }
        else {
            System.out.println("Result is: \n you win = " + yourCounter + " , " + "comp win = " + compCounter + " , " +
                    "draw = " + draw);
            System.out.println("Context is draw with: " + yourCounter + "-" + compCounter );
        }
    }
}