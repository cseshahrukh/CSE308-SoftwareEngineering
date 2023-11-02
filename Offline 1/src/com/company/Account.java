package com.company;

public class Account {
    public String accountName;
    public double amount;
    public double loanAmount=0;
    public double interest;
    public double loanInterest=0.1;
    public String type;

    public void setLoanInterest(double value)
    {
        loanInterest=value;
    }
    public Account(String name, double money, String accountType)
    {
        accountName=name;
        amount=money;
        type=accountType;

    }

    public double deposit(double value)
    {
        amount+=value;
        return value;
    }

    public void withdraw(double  value, Bank a)
    {
        amount-=value;
        a.initialFund-=value;


    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }
    public void setInterest(double inter)
    {
        interest=inter;
    }
}



