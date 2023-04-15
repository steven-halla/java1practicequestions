package chapter3;

import java.util.Scanner;

public class SolveQuadraticEquation {
    public static void main(String[] args) {
        // Prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Compute discriminant and roots
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double r1, r2;
        if (discriminant > 0) {
            r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.printf("The roots are %.2f and %.2f%n", r1, r2);
        } else if (discriminant == 0) {
            r1 = -b / (2 * a);
            System.out.printf("The root is %.2f%n", r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
