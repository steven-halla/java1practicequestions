public class PopulationControl {
    public static void main(String[] args) {
        double currentPopulation = 312032486;
        int daysPerYear = 365;
        double birthPeoplePerDay = 86400.0 / 7.0;
        double deathPeoplePerDay = 86400.0 / 13.0;
        double immigrantPeoplePerDay = 86400.0 / 45.0;

        double populationChangePerDay = birthPeoplePerDay + immigrantPeoplePerDay - deathPeoplePerDay;

        for (int i = 1; i <= 5; i++) {
            double population = currentPopulation + populationChangePerDay * daysPerYear * i;
            System.out.println("Population for year " + i + " is " + population);
        }
    }
}

