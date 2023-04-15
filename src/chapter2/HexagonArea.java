package chapter2;

import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the hexagon: ");
        double sideLength = input.nextDouble(); // read user input for the side length

        double area = (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2; // calculate the area

        System.out.println("The area of the hexagon is: " + area); // display the result
    }
}
