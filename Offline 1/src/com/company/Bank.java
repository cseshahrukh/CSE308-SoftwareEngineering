package com.company;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts;
    ArrayList<Employee> employees;
    int initialFund=1000000;
    int userOrEmployee=0; //1 means user and Employee is 2 //flag variable
    String loanName="";
    double loanAmount;
    String current=""; //Manager or Cashier or User


    public Bank(){
        ManagingDirector m=new ManagingDirector("MD");
        employees=new ArrayList<>();
        employees.add(m);

        Officer o=new Officer("S1");
        employees.add(o);
        o=new Officer("S2");
        employees.add(o);

        accounts=new ArrayList<>();

        for(int i=1; i<=5; i++)
        {
            String name="C";
            name=name+ (+i);
            //System.out.println("Cashier Name is "+name);
            Cashier c=new Cashier(name);
            employees.add(c) ;
        }

        System.out.println("Bank Created: MD, S1, S2, C1, C2, C3, C4, C5 created");



    }

    public void change(String type, double rate)
    {

        for(int i=0; i<employees.size();i++)
        {
            if(employees.get(i).name.equals(current))
            {
                employees.get(i).change(type, rate, this);
            }
        }


    }

    public void query(){
        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).getAccountName().equals(current))
            {
                double balance=accounts.get(i).amount;
                System.out.print("Current balance "+(balance+accounts.get(i).loanAmount));
                if(accounts.get(i).loanAmount==0)
                    System.out.println(" ");
                else
                    System.out.println(", Loan "+accounts.get(i).loanAmount);

            }
        }
    }

    public void requestLoan(String name, double amount)
    {
        //System.out.println("Inside requestLoan name is "+ name);
        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).accountName.equals(name))
            {
                String type=accounts.get(i).type;
                if(type.equals("Student"))
                {
                    if(accounts.get(i).loanAmount+amount<=1000)
                    {
                        loanName=name;
                        loanAmount=amount;
                        System.out.println("Loan request successful, sent for approval");


                    }
                    else
                    {
                        System.out.println("Maximum Total Loan For Student is 1000");
                    }

                }

                if(type.equals("Savings"))
                {
                    if(accounts.get(i).loanAmount+amount<=10000)
                    {
                        loanName=name;
                        loanAmount=amount;
                        System.out.println("Loan request successful, sent for approval");

                    }
                    else
                    {
                        System.out.println("Maximum Total Loan For Savings Account is 10000");
                    }
                }

                if(type.equals("FixedDeposit"))
                {
                    if(accounts.get(i).loanAmount+amount<=100000)
                    {
                        loanName=name;
                        loanAmount=amount;
                        System.out.println("Loan request successful, sent for approval");
                    }
                    else
                    {
                        System.out.println("Maximum Total Loan For FixedDeposit Account is 100000");
                    }
                }

                if(type.equals("Loan"))
                {
                    if(accounts.get(i).loanAmount+amount<=accounts.get(i).amount*0.05)
                    //5 percent er kom nite parbe extra
                    {
                        loanName=name;
                        loanAmount=amount;
                        System.out.println("Loan request successful, sent for approval");

                    }
                    else
                    {
                        System.out.println("Maximum Total Loan For Student is 1000");
                    }
                }
            }
        }
        //System.out.println("Loan name before approve is "+loanName);
        //System.out.println("No account with this name");


    }

    public void approve (String name, double amount, String employeeName)
    {
        for(int i=0; i<employees.size(); i++)
        {
            if(current.equals(employees.get(i).name))
            {
                employees.get(i).approve(name, amount, this);
            }
        }



    }
    public void increment()
    {
        System.out.println("1 Year Passed");
        for(int i=0; i<accounts.size(); i++)
        {
            double profitAmount=accounts.get(i).interest*accounts.get(i).getAmount();
            initialFund+=profitAmount; //interest diye bank er profit holo
            accounts.get(i).amount=accounts.get(i).getAmount()+accounts.get(i).interest*accounts.get(i).getAmount();
            accounts.get(i).loanAmount=accounts.get(i).loanAmount-accounts.get(i).loanInterest*accounts.get(i).loanAmount;

            //question e bolche loan amount deduct hobe each year


            if(accounts.get(i).amount>=500 && accounts.get(i).type.compareTo("Loan")!=0)
                accounts.get(i).amount-=500; //service charge
        }
    }

    public void open()
    {


        for(int i=0; i<employees.size(); i++)
        {
            if(current.equals(employees.get(i).name))
            {
                employees.get(i).open(this);
                return;
            }
        }


            for(int i=0; i<accounts.size(); i++)
            {
                if(current.compareTo(accounts.get(i).accountName)==0)
                {
                    System.out.println("Welcome back "+ current);
                }
            }

    }

    public void deposit(double value)
    {
        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).getAccountName().equals(current))
            {
                initialFund+=accounts.get(i).deposit(value);
                System.out.println(value+"$ deposited; current balance "+accounts.get(i).getAmount()+"$");
            }
        }
    }

    public void withdraw(double value)
    {
        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).getAccountName().equals(current))
            {
                //System.out.println("Matched ");
                accounts.get(i).withdraw(value, this);
                //System.out.println(Integer.parseInt(strArray[1])+"$ deposited; current balance "+a.accounts.get(i).getAmount()+"$");
            }
        }
    }

    public void lookup(String searchName)
    {
        for(int i=0; i<employees.size(); i++)
        {
            if(current.equals(employees.get(i)))
            {
                employees.get(i).lookup(searchName, this);
                return ;
            }
        }
        System.out.println("Please login with employee to see look up");
    }

    public void see()
    {
        for(int i=0; i<employees.size(); i++)
        {
            //System.out.println("INside the for loop ");
            if(employees.get(i).name.compareTo(current)==0)
            {
                employees.get(i).seeInternalFund(this);
            }
        }
    }

    public void create(String name, String type, double amount)
    {
        boolean flag=true;

        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).getAccountName().equals(name))
            {
                System.out.println("Already Same Name. Try Another");
                return;
            }
        }


        //System.out.println("Size of array is "+ strArray.length);
        if(type.compareTo("Student")==0)
        {
            Student s=new Student(name, amount);
            accounts.add(s);
            initialFund+=amount;
            System.out.println("Student account for "+name+" Created; initial balance "+amount+"$");
            current=name;
        }
        else if (type.compareTo("Savings")==0)
        {
            Savings s=new Savings(name, amount);
            accounts.add(s);
            initialFund+=amount;
            System.out.println("Savings account for "+name+" Created; initial balance "+amount+"$");
            current=name;
        }
        else if (type.compareTo("FixedDeposit")==0)
        {
            if(amount<100000)
            {
                System.out.println("Very Little Amount");
                return;
            }

            FixedDeposit s=new FixedDeposit(name, amount);
            accounts.add(s);
            initialFund+=amount;
            System.out.println("FixedDeposit account for "+name+" Created; initial balance "+amount+"$");
            current=name;
        }
        else if (type.compareTo("Loan")==0)
        {
            Loan s=new Loan(name, amount);
            accounts.add(s);
            initialFund-=amount; //Loan dile Initial Fund kome jabe
            System.out.println("Loan account for "+name+" Created; initial balance "+amount+"$");
            current=name;
        }

        current=name; //er upor samne operation hote pare tai
    }

    public void close()
    {
        //Employee Er Jonno Ek Rokom Msg
        //User er jonno arek rokom msg
        boolean done=false;
        //System.out.println("Transaction Closed For "+ currentName);
        for(int i=0; i<employees.size(); i++)
        {
            if(current.equals(employees.get(i).name))
            {
                done=true;
                System.out.println("Operations for "+ current+" closed");
                break;
            }
        }
        if(!done)
            System.out.println("Transaction Closed for "+ current);

        current="";
    }
}
