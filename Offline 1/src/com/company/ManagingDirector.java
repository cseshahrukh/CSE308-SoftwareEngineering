package com.company;

public class ManagingDirector extends Officer {

    public ManagingDirector(String s) {
        super(s);
    }

    public void change(String type, double rate, Bank a) {
        for(int i=0; i<a.accounts.size(); i++)
        {
            if(a.accounts.get(i).type.equals(type))
            {
                a.accounts.get(i).setInterest(rate);
            }
        }
        System.out.println("Interest Rate Changed");
    }


    public void seeInternalFund(Bank a) {
        //System.out.println("Inside manager seeInternalFund");
        //Employee e = new Employee("");
        System.out.println("Internal Fund is "+a.initialFund);
        //super.seeInternalFund(a);
    }
}
