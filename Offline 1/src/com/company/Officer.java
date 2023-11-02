package com.company;

public class Officer extends Cashier {
    public Officer(String s) {
        super(s);
    }

    public void approve(String name, double amount, Bank a)
    {
        for(int i=0; i<a.accounts.size(); i++)
        {
            if(a.accounts.get(i).accountName.compareTo(name)==0)
            {
                if(a.accounts.get(i).type=="Loan")
                {
                    if(amount<=a.accounts.get(i).amount*0.05 && amount<= a.initialFund)
                    {
                        a.initialFund-=amount;
                        a.accounts.get(i).amount=a.accounts.get(i).amount+amount;
                        System.out.println("Loan for "+name+" approved");
                    }
                    else
                    {
                        System.out.println("Policy break for 5% or Little money in bank");
                    }
                }
                else
                {
                    a.accounts.get(i).loanAmount+=amount;
                    System.out.println("Loan for "+name+" approved");
                }


            }
        }
        a.loanName="";

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

    public void seeInternalFund(Bank a) {
        super.seeInternalFund(a);
    }
}
