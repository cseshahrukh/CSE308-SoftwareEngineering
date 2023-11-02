package com.company;

public class Loan extends Account {
    public double interest = 0.10;

    public Loan(String name, double money) {
        super(name, money, "Loan");
        super.setInterest(interest);
    }

    public double deposit(double value)
    {
        amount-=value;
        return value;
    }


    public void withdraw(double value, Bank a) {
        System.out.println("Can't Withdraw in Loan Account");
    }


    public double getInterest() {
        return interest;
    }
}
