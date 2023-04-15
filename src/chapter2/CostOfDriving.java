package chapter2;


//inputs needed

//variable distance driven


// variable miles per gallon

// varible price per gallon


//


import java.util.Scanner;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        // Prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distanceDriven = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // Calculate cost of driving
        double costPerGallon = distanceDriven / milesPerGallon;
        double totalCost = costPerGallon * pricePerGallon;

        // Display result
        System.out.printf("The cost of driving is $%.2f%n", totalCost);
    }
}

//
