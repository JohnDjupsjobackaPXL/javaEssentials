package be.pxl.h1.opdracht7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef de temperatuur in C:");
        double temperatureCelsius = input.nextInt();
        input.nextLine();
        double temperatureFahrenheit = 9.0 / 5.0 * temperatureCelsius + 32;
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println( temperatureCelsius  + "ºC is " + df.format(temperatureFahrenheit) + "ºF.");
        System.out.println(temperatureFahrenheit);
        temperatureFahrenheit = Math.floor(temperatureFahrenheit * 10) / 10.0;
        System.out.println(temperatureFahrenheit);
        input.close();
    }
}
