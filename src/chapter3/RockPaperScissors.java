package chapter3;
//create a string input for the player
// create a random numbr betwee 1-3
//print statements that tells user if they win or lose
import java.util.Random;


import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose rock,paper, scissors");

        String playerRPSChoice = input.nextLine();
        String computerRPSChoice = "";
        Random number = new Random();
        int randomHandNumber = number.nextInt(3) + 1;

        if (randomHandNumber == 1) {
            computerRPSChoice = "rock";
        } else if (randomHandNumber == 2) {
            computerRPSChoice = "paper";
        }else {
            computerRPSChoice = "scissors";
        }

        if (playerRPSChoice.equals(computerRPSChoice)) {
            System.out.println("Its a tie. You threw" + playerRPSChoice +
                    " computer threw: " + computerRPSChoice);
        } else if (playerRPSChoice.equals("rock") && computerRPSChoice.equals("scissors")) {
            System.out.println("You win.  You threw a: " + playerRPSChoice +
                    " computer threw: " + computerRPSChoice);
        } else if(playerRPSChoice.equals("rock") && computerRPSChoice.equals("paper")) {
            System.out.println("You lose.  You threw a: " + playerRPSChoice +
                    " computer threw: " + computerRPSChoice);
        }
        else if (playerRPSChoice.equals("paper") && computerRPSChoice.equals("rock")) {
            System.out.println("You win.  You threw a: " + playerRPSChoice +
                    " computer threw: " + computerRPSChoice);
        } else if(playerRPSChoice.equals("paper") && computerRPSChoice.equals("scissors")) {
            System.out.println("You lose.  You threw a: " + playerRPSChoice +
                    " computer threw: " + computerRPSChoice);
        }
        else if (playerRPSChoice.equals("scissors") && computerRPSChoice.equals("paper")) {
            System.out.println("You win.  You threw a: " + playerRPSChoice +
                    " computer threw: " + computerRPSChoice);
        } else if(playerRPSChoice.equals("scissors") && computerRPSChoice.equals("rock")) {
            System.out.println("You lose.  You threw a: " + playerRPSChoice +
                    " computer threw: " + computerRPSChoice);
        }

    }
}
