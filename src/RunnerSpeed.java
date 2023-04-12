public class RunnerSpeed {
    public static void main(String[] args) {
        // Convert kilometers to miles
        double miles = 14 / 1.6;

        // Convert time to hours
        double hours = (45.0 / 60.0) + (30.0 / 3600.0);

        // Calculate average speed in miles per hour
        double speed = miles / hours;

        // Display result
        System.out.println("The average speed is " + speed + " miles per hour.");
    }
}

