package chapter2;

import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterKilo = scanner.nextDouble();

        System.out.print("Enter the initial temperature of the water in degrees Celsius: ");
        double initialWaterTemp = scanner.nextDouble();

        System.out.print("Enter the final temperature of the water in degrees Celsius: ");
        double finalWaterTemp = scanner.nextDouble();

        double energyNeeded = waterKilo * (finalWaterTemp - initialWaterTemp) * 4184;

        System.out.println("The energy needed is: " + energyNeeded + " joules.");

        scanner.close();
    }
}
