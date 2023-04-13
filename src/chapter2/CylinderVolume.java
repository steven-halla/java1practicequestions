package chapter2;

public class CylinderVolume {
    public static void main(String[] args) {
        double circleRadius = 5.5;
        double circleLength = 12;
        double area = circleRadius * circleRadius * Math.PI;
        double volume = area * circleLength;
        System.out.println("The area is " + area + "the volume is " + volume);
    }
}
