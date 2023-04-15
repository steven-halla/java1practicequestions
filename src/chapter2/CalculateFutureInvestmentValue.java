package chapter2;

import java.util.Scanner;

//(Financial application: calculate future investment value) Write a program that
//        reads in investment amount, annual interest rate, and number of years, and displays
//        the future investment value using the following formula:
//        futureInvestmentValue =
//        investmentAmount * (1 + monthlyInterestRate)sqrt(numberOfYears*12)
//        For example, if you enter amount 1000, annual interest rate 3.25%, and number
//        of years 1, the future investment value is 1032.98.

// variable investment amount

// variable anual interest rate

// variable number of years
// we need scanner inputs
// display future investment value

////        investmentAmount * (1 + monthlyInterestRate)numberOfYears*12 This is our formula
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        // Prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        // Calculate future investment value
        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfMonths = numberOfYears * 12;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);

        // Display result
        System.out.printf("Accumulated value is $%.2f%n", futureInvestmentValue);
    }
}




