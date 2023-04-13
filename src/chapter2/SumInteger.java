package chapter2;
import java.util.Scanner;


import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int num = scanner.nextInt();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // add the last digit to the sum
            num /= 10;       // remove the last digit from the number
        }

        System.out.println("The sum of the digits is " + sum);

        scanner.close();
    }
}
