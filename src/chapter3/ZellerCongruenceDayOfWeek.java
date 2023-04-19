import java.util.Scanner;

public class ZellerCongruenceDayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int currentYear = input.nextInt();

        System.out.println("Enter the month(1-12): ");
        int currentMonth = input.nextInt();

        System.out.println("Enter the day (1-31): ");
        int currentDay = input.nextInt();

        if (currentMonth < 3) {
            currentMonth += 12;
            currentYear -= 1;
        }

        int k = currentYear % 100;
        int j = currentYear / 100;
        int m = currentMonth;
        int q = currentDay;

        final int ZELLERCONGRUENCE = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;
        int h = ZELLERCONGRUENCE;

        String dayOfWeek;

        switch (h) {
            case 0:
                dayOfWeek = "Saturday";
                break;
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            default:
                dayOfWeek = "Invalid day of the week";
        }

        System.out.println("The day of the week is " + dayOfWeek);
    }
}
