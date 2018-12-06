package be.pxl.h2.oefeningen.oef3;

import java.util.Scanner;

public class BankAccountApp {
    // Scanner opzetten voor eventuele keyboard input.
    public static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
        Account rekening1 = new Account("001-001-001");

        rekening1.accountPrintOut();
        rekening1.deposit(50);
        rekening1.accountPrintOut();
        rekening1.withdraw(-50);

        Account rekening2 = new Account("001-002-001","Jef Patat", 100.0, 1.1);
        rekening2.accountPrintOut();
        rekening2.accountDividendPayment();
        rekening2.accountPrintOut();
        System.out.println("Overzetten van balans van rekening 2 naar rekening 1.");
        rekening1.deposit(rekening2.withdraw(rekening2.getAccountBalance()));
        rekening1.accountPrintOut();
        rekening2.accountPrintOut();




        keyboardInput.close();
    }
}
