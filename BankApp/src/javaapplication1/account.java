package javaapplication1;

public class account {

    private double balance = 0;
    private double interest = 0.2;
    private int accountNumber;
    private static int numberofAccounts = 1000000;

    account() {
        accountNumber = numberofAccounts++;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the interest
     */
    public double getInterest() {
        return interest * 100;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    public void withdraw(double amount) {

        if (amount + 5 > balance) {
            System.out.println("You Have Insufficient funds.");
            return;
        }
        balance -= amount + 5;
        checkInterest(0);
        System.out.println("You Have withdrawn" + amount + "dollars and incurred a fee of $5");
        System.out.println("You now have a balance" + balance);

    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("You Cannot deposit negative money");
            return;
        }

        checkInterest(amount);
        amount = amount + amount * interest;
        balance += amount;
        System.out.println("You Have deposited $" + amount + "dollars with interest rate of"
                + (interest * 100) + "%");
        System.out.println("You Have a balance og $" + balance);
    }

    public void checkInterest(double amount) {
        if (balance + amount > 100000) {
            interest = 0.05;
        } else {
            interest = 0.02;
        }
    }
}
