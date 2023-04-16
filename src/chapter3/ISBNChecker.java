package chapter3;

import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter first 9 digits of ISBN as integer
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digits = input.nextInt();

        // Calculate checksum
        int checksum = (digits / 100000000 * 1 +
                digits / 10000000 % 10 * 2 +
                digits / 1000000 % 10 * 3 +
                digits / 100000 % 10 * 4 +
                digits / 10000 % 10 * 5 +
                digits / 1000 % 10 * 6 +
                digits / 100 % 10 * 7 +
                digits / 10 % 10 * 8 +
                digits % 10 * 9) % 11;

        // Display ISBN-10 number
        if (checksum == 10) {
            System.out.println("The ISBN-10 number is " + digits + "X");
        } else {
            System.out.println("The ISBN-10 number is " + digits + checksum);
        }
    }
}
