package chapter3;

import java.util.Scanner;

//have user type in 3 numbers
//we will do this using an if statement
// to get the array digits we need to divide by numbers
//we must also have rulse to only allow a user to type 3 numbers
public class IsPalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        int threeDigitInputNumber = input.nextInt();

        if (threeDigitInputNumber < 100 || threeDigitInputNumber > 999) {
            System.out.println("Invalid input. Please enter a 3 digit number: " + threeDigitInputNumber);
        } else {
            int firstDigit = threeDigitInputNumber / 100;
            int lastDigit = threeDigitInputNumber % 10;

            if (firstDigit == lastDigit) {
                System.out.println("This is a palindrome.");
            } else {
                System.out.println("This is not a palindrome.");
            }
        }
    }
}
