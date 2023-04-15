package chapter2;
import java.util.Scanner;

//create variable for weight in pounds
//create variable for height in inches
//caluclate BMI
//convert from pounds, to kilograms
//convert from inches, to meters
//0.45359237 this is per pound, so create a constant
//0.0254 this is per inch, so create a constant
//we are dealing with inputs so create scanner class
public class ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double kiloGramConverter = 0.45359237;
        final double metersConverter = 0.025495;


        System.out.print("Enter the number of pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter the number of inches: ");
        double inchs = input.nextDouble();

        double kilograms = pounds * kiloGramConverter;
        double meters = inchs * metersConverter;

        double bmi = kilograms / (meters * meters);
        System.out.println("Your BMI is: " + bmi);

    }
}
