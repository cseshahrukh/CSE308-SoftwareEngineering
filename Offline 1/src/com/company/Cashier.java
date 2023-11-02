package com.company;

public class Cashier extends Employee {
    public Cashier(String s) {
        super(s);
    }

    public void seeInternalFund(Bank a) {
        //System.out.println("INside Cashier's seeInternalFund function");
        super.seeInternalFund(a);
    }

    public void open(Bank a)
    {
        System.out.println("Welcome Cashier "+ a.current);
    }
}
