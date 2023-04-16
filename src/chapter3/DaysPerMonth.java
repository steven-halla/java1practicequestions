package chapter3;

import java.util.Scanner;

public class DaysPerMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for month and year
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Calculate number of days in month
        int numDays;

        if (month == 2) {
            // Check for leap year
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                numDays = 29;
            } else {
                numDays = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            numDays = 30;
        } else {
            numDays = 31;
        }

        // Display number of days in month
        String monthName;

        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Invalid month"; break;
        }

        System.out.println(monthName + " " + year + " had " + numDays + " days.");
    }
}
