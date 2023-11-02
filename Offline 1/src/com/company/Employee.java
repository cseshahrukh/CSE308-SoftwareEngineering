package com.company;

public class Employee {
    String name;
    String type; //MD Officer Cashier
    public Employee(String s)
    {
        name=s;
    }

    public void lookup(String searchName, Bank a){
        for(int i=0; i<a.accounts.size(); i++)
        {

            if(a.accounts.get(i).getAccountName().equals(searchName))
            {

                System.out.println(searchName+ "'s current balance is "+(a.accounts.get(i).getAmount()+a.accounts.get(i).loanAmount) +"$");
            }
        }
    }

    public void change(String type, double rate, Bank a) {
        System.out.println("You don't have permission to change interest");

    }

    public void seeInternalFund(Bank a) {
        //System.out.println("SeeInitialFund Function of Employee");

        //System.out.println("Internal Fund is "+a.initialFund);
        System.out.println("You don't have permission to see internalFund.");
    }

    public void approve(String name, double amount, Bank a)
    {
        System.out.println("You don't have permission to approve loans");
    }

    public void open(Bank a)
    {
        System.out.println("Welcome "+a.current);
        System.out.println(a.current+" active");
        if( (a.loanName.compareTo("")!=0))
        {
            System.out.println("there are loan approvals pending");
        }
    }
}

