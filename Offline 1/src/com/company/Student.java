package com.company;

public class Student extends Account {
    public double interest = 0.05;

    public Student(String name, double money) {
        super(name, money, "Student");
        super.setInterest(interest);

    }


    public void withdraw(double value, Bank a) {
        if (value <= 10000 && amount >= value) {
            super.withdraw(value, a);
            System.out.println("Successful Transaction; current balance " + amount + "$");
            a.initialFund-=value;
        } else
            System.out.println("Invalid transaction; current balance " + amount + "$");

    }

    public double getInterest(){
        return interest;
    }
}
