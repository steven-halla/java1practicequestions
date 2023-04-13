public class AverageSpeedKiloM {
    public static void main(String[] args) {
        // Convert miles to kilometers
        double kilometers = 24 * 1.6;

        // Convert time to hours
        double hours = 1 + 40.0 / 60.0 + 35.0 / 3600.0;

        // Calculate average speed in kilometers per hour
        double speed = kilometers / hours;

        // Display result
        System.out.println("The average speed is " + speed + " kilometers per hour.");
    }
}
