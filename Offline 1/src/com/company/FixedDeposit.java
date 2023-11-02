package com.company;

public class FixedDeposit extends Account {
    public double interest = 0.15;

    public FixedDeposit(String name, double money) {
        super(name, money, "FixedDeposit");
        super.setInterest(interest);
    }

    public void withdraw(double value, Bank a) {

            System.out.println("Can't withdraw in fixed deposit. Invalid transaction; current balance " + amount + "$");

    }
}
