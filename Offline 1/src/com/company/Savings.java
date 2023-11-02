package com.company;

public class Savings extends Account {
    double savingsInterest = 0.1;

    public Savings(String name, double money) {

        super(name, money, "Savings");
        super.setInterest(interest);
    }

    public void withdraw(double value, Bank a) {
        if (amount-value >= 1000 ) {
            super.withdraw(value, a);
            System.out.println("Successful Transaction; current balance " + amount + "$");
            a.initialFund-=value;
        } else
            System.out.println("Invalid transaction; current balance " + amount + "$");

    }
    public double getInterest() {
        return interest;
    }

}
