package chapter2;
import java.util.Scanner;

import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentPopulation = 312032486;
        int daysPerYear = 365;
        double birthPeoplePerDay = 86400.0 / 7.0;
        double deathPeoplePerDay = 86400.0 / 13.0;
        double immigrantPeoplePerDay = 86400.0 / 45.0;

        double populationChangePerDay = birthPeoplePerDay + immigrantPeoplePerDay - deathPeoplePerDay;

        System.out.print("Enter the number of years: ");
        int yearsPeople = scanner.nextInt();
        int yearsCalculated = (int)(currentPopulation + yearsPeople * populationChangePerDay);

        System.out.println("The population in " + yearsPeople + " years is " + yearsCalculated);

        scanner.close();
    }
}
