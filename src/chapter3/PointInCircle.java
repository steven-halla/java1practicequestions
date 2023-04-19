package chapter3;

/**
 * The PointInCircle program prompts the user to enter a point (x, y)
 * and checks whether the point is inside the circle centered at (0, 0)
 * with radius 10. A point is in the circle if its distance to (0, 0) is
 * less than or equal to 10. The formula for computing the distance is
 * 2(x2 - x1)2 + (y2 - y1)2.
 *
 * @author Your Name
 */
import java.util.Scanner;

public class PointInCircle {
    /**
     * The main method prompts the user to enter a point (x, y), calculates
     * the distance of the point from the origin (0, 0) using the distance
     * formula, and checks if the distance is less than or equal to 10 (the
     * radius of the circle). If the distance is less than or equal to 10, the
     * program prints that the point is inside the circle. Otherwise, it prints
     * that the point is outside the circle.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point (x, y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        //for the HW we center the cordinates at 0,0, so there is no need to
        // subtract anything for the below
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (distance <= 10) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle");
        }
    }
}
