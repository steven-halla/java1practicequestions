package chapter3;

import java.util.Scanner;

public class TrianglePoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the coordinates of the point from the user
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Check if the point is inside the triangle
        boolean isInside = isInsideTriangle(x, y);

        // Display the result
        System.out.println("The point is " + (isInside ? "inside" : "outside") + " the triangle.");
    }

    // Returns true if the given point is inside the triangle, false otherwise
    public static boolean isInsideTriangle(double x, double y) {
        // Compute the areas of the three triangles formed by the point and the triangle's vertices
        double area1 = computeTriangleArea(0, 0, 200, 0, x, y);
        double area2 = computeTriangleArea(0, 0, 0, 100, x, y);
        double area3 = computeTriangleArea(0, 100, 200, 0, x, y);

        // The point is inside the triangle if the sum of the areas of the three triangles equals the area of the whole triangle
        double totalArea = computeTriangleArea(0, 0, 200, 0, 0, 100);
        return Math.abs(area1 + area2 + area3 - totalArea) < 1e-6;
    }

    // Computes the area of a triangle given its three vertices
    public static double computeTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2.0);
    }
}
