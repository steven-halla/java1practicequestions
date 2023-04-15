package chapter2;

import java.util.Scanner;

public class LocateLargestElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the array: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns in the array: ");
        int columns = input.nextInt();

        double[][] myArray = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            System.out.printf("Enter row %d elements: ", i + 1);
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = input.nextDouble();
            }
        }

        int[] largestElementLocation = locateLargest(myArray);
        System.out.printf("The location of the largest element is at (%d, %d)%n", largestElementLocation[0], largestElementLocation[1]);

        System.out.println("The 2D array is:");
        printArray(myArray);

        input.close();
    }

    public static int[] locateLargest(double[][] myArray) {
        int[] largestElementLocation = new int[2];
        double largestElement = myArray[0][0];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] > largestElement) {
                    largestElement = myArray[i][j];
                    largestElementLocation[0] = i;
                    largestElementLocation[1] = j;
                }
            }
        }

        return largestElementLocation;
    }

    public static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double element : row) {
                System.out.printf("%6.2f ", element);
            }
            System.out.println();
        }
    }
}
