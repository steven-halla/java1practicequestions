package chapter2;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read subtotal and gratuity rate from user
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate (as a percentage): ");
        double gratuityRate = input.nextDouble();

        // Compute gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        // Display results
        System.out.println("Gratuity: $" + gratuity);
        System.out.println("Total: $" + total);
    }
}


