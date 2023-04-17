package chapter3;

import java.util.Scanner;
import java.util.Random;

//we need input from a user
//we only need 2 numbers, heads or tails
// we need to do a compariter function
public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter heads or tails:");
        String inputString = input.nextLine();





        Random number = new Random();
        String headsOrTails = "";
        int randomNumber = number.nextInt(2) + 1;
        if (randomNumber == 1) {
            headsOrTails = "tails";
        } else {
            headsOrTails = "heads";
        }
        System.out.println("Your guess was a : " + inputString);
        System.out.println("The coin flip is a : " + headsOrTails);

        if (inputString.equals(headsOrTails)) {
            System.out.println("grats you guessed right.");
        } else {
            System.out.println("to bad you guessed wrong");
        }





    }
}
