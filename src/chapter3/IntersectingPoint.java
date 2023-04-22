package chapter3;

import java.util.Scanner;

import java.util.Scanner;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class IntersectingPoint {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the coordinates for point 1 (x y): ");
        double x1Cordinate = userInput.nextDouble();
        double y1Cordinate = userInput.nextDouble();

        System.out.print("Enter the coordinates for point 2 (x y): ");
        double x2Cordinate = userInput.nextDouble();
        double y2Cordinate = userInput.nextDouble();

        System.out.print("Enter the coordinates for point 3 (x y): ");
        double x3Cordinate = userInput.nextDouble();
        double y3Cordinate = userInput.nextDouble();

        System.out.print("Enter the coordinates for point 4 (x y): ");
        double x4Cordinate = userInput.nextDouble();
        double y4Cordinate = userInput.nextDouble();

        Point2D intersection = findIntersection(x1Cordinate, y1Cordinate, x2Cordinate, y2Cordinate,
                x3Cordinate, y3Cordinate, x4Cordinate, y4Cordinate);

        if (intersection != null) {
            System.out.println("The intersection point is (" + intersection.getX() + ", " + intersection.getY() + ")");
        } else {
            System.out.println("The two lines are parallel");
        }
    }

    public static Point2D findIntersection(double x1, double y1, double x2, double y2, double x3, double y3,
                                           double x4, double y4) {
        double a1 = y1 - y2;
        double b1 = x2 - x1;
        double c1 = x1 * y2 - x2 * y1;
        double a2 = y3 - y4;
        double b2 = x4 - x3;
        double c2 = x3 * y4 - x4 * y3;

        double det = a1 * b2 - a2 * b1;
        if (det == 0) {
            return null;
        }

        double x = (b1 * c2 - b2 * c1) / det;
        double y = (a2 * c1 - a1 * c2) / det;

        return new Point2D.Double(x, y);
    }
}
