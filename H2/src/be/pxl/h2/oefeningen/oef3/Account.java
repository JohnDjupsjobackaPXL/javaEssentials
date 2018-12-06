package be.pxl.h2.oefeningen.oef3;

public class Account {
    // Fields
    private String accountNumber;
    private String accountOwner;
    private double accountBalance;
    private double accountInterestRate;

    // Constructors
    public Account() {
        this("none", "unknown", 0, 1.2);
    }

    public Account(String accountNumber, String accountOwner, double accountBalance, double accountInterestRate) {
        this.setAccountNumber(accountNumber);
        this.setAccountOwner(accountOwner);
        if (accountBalance < 0) {
            accountBalance = 0;
        }
        this.setAccountBalance(accountBalance);
        if (accountInterestRate < 0) {
            accountInterestRate = 0;
        }
        this.setAccountInterestRate(accountInterestRate);
    }

    // Getters
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountOwner() {
        return this.accountOwner;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public double getAccountInterestRate() {
        return this.accountInterestRate;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountInterestRate(double accountInterestRate) {
        this.accountInterestRate = accountInterestRate;
    }

    // Methods
    public void deposit(double accountDeposit) {
        if (accountDeposit > 0) {
            setAccountBalance(this.accountBalance + accountDeposit);
        } else {
            System.out.println("Kan niet een negatief deposito doen!");
        }
    }

    public double withdraw(double accountWithdrawal) {
        if (accountWithdrawal > 0) {
            if (this.accountBalance == 0) {
                System.out.printf("Er is %.2f op de rekening, u kan geen geld opnemen.", this.accountBalance);
                return 0;
            }
            else if (accountWithdrawal > this.accountBalance) {
                System.out.printf("U kan maximaal %.2f opnemen", this.accountBalance);
                accountWithdrawal = this.accountBalance;
                setAccountBalance(0);
                return accountWithdrawal;
            } else {
                setAccountBalance(this.accountBalance - accountWithdrawal);
                return accountWithdrawal;
            }
        } else {
            System.out.println("Kan niet een negatief bedrag afnemen!");
            return 0;
        }
    }
}
