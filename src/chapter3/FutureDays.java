package chapter3;
//7 days a week, each day is assigned a value,
//create a variable, along with IF statement,
// if input == 0, then today is sunday
// we need input so scanner class needed

import java.util.Scanner;

import java.util.Scanner;

public class FutureDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String weekDay = "";

        System.out.print("Enter the day of week (Sunday is 0, Monday is 1, ..., Saturday is 6): ");
        int dayOfWeek = input.nextInt();

        if(dayOfWeek < 0 || dayOfWeek > 6) {
            System.out.println("Input must be between 0-6");
            System.exit(1);
        }

        System.out.print("Enter the amount of days since today: ");
        int futureDay = input.nextInt();

        int futureDayOfWeek = (dayOfWeek + futureDay) % 7;

        switch (futureDayOfWeek) {
            case 0: weekDay = "Sunday"; break;
            case 1: weekDay = "Monday"; break;
            case 2: weekDay = "Tuesday"; break;
            case 3: weekDay = "Wednesday"; break;
            case 4: weekDay = "Thursday"; break;
            case 5: weekDay = "Friday"; break;
            case 6: weekDay = "Saturday"; break;
        }

        System.out.printf("Today is %s and the future day is %s%n", getWeekDayName(dayOfWeek), weekDay);
    }

    public static String getWeekDayName(int dayOfWeek) {
        switch (dayOfWeek) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Invalid input";
        }
    }
}

