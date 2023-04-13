package chapter2;

import org.w3c.dom.ls.LSOutput;

public class CelciusToFahren {
    public static void main(String[] args) {
        double celsiusDegrees = 43;
        double fahrenheitDegrees = (9.0/5.0) * celsiusDegrees + 32;

        System.out.println(fahrenheitDegrees);
    }



}
