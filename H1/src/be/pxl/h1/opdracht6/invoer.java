package be.pxl.h1.opdracht6;

import java.util.Scanner;

public class invoer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef je voornaam:");
        String firstName = input.nextLine();
        System.out.println("Geef je achternaam:");
        String lastName = input.nextLine();
        System.out.println("Jouw naam is " + lastName + ", " + firstName + " " + lastName + ".");
        input.close();
    }
}
