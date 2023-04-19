package chapter3;

import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = input.nextDouble();

        double cost = 0.0;
        if (weight > 0 && weight <= 1) {
            cost = 3.5;
        } else if (weight <= 3) {
            cost = 5.5;
        } else if (weight <= 10) {
            cost = 8.5;
        } else if (weight <= 20) {
            cost = 10.5;
        } else if (weight <= 50) {
            cost = 15.0;
        } else {
            System.out.println("The package cannot be shipped.");
            System.exit(0);
        }

        System.out.println("The shipping cost is $" + cost);
    }
}

