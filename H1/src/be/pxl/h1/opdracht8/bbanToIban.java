package be.pxl.h1.opdracht8;

import java.util.Scanner;

public class bbanToIban {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef BBAN:");
        long nationalAccountNumber;
        nationalAccountNumber = input.nextLong();
        input.nextLine();
        System.out.println(nationalAccountNumber);
        int internationalAccountNumber = (int) (98 - ((nationalAccountNumber * 1000000 + 111400) % 97));
        System.out.println(internationalAccountNumber);

    }
}
