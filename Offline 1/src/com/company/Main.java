package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank a=new Bank();
        boolean flag=true;
        String currentName="";
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            flag=true;
            String str=sc.nextLine();
            String[] strArray = str.split(" ");

            if(strArray[0].compareTo("Create")==0)
            {
                //Create Alice Student 1000

                String name=strArray[1];
                String type=strArray[2];
                double amount=Double.parseDouble(strArray[3]);
                a.create(name, type, amount);
                //System.out.println("Inside Create in main function a.cuurent is "+a.current);

            }




            else if (strArray[0].compareTo("Close")==0)
            {
                a.close();
            }



            else if (strArray[0].compareTo("Request")==0)
            {

                int value=Integer.parseInt(strArray[1]);
                a.requestLoan(a.current, value);
            }

            else if (strArray[0].compareTo("Query")==0)
            {
                a.query();
                //System.out.println("Inside Query section");


            }

            else if (strArray[0].compareTo("Open")==0)
            {
                    a.current=strArray[1];
                    a.open();
            }

            else if (strArray[0].compareTo("Approve")==0)
            {
                //System.out.println("Inside main function approve loanname and current are "+a.loanName+" "+a.current);
                a.approve(a.loanName, a.loanAmount, a.current);
                //Ki kori ? a.loanName="";
            }

            else if (strArray[0].compareTo("Deposit")==0)
            {
                double value=Double.parseDouble(strArray[1]);
                a.deposit(value);
                //System.out.println("INside diposit section");


            }

            else if (strArray[0].compareTo("Withdraw")==0)
            {
                a.withdraw(Double.parseDouble(strArray[1]));
                //System.out.println("INside withdraw section");
                //System.out.println("a.current is "+a.current);

            }

            else if (strArray[0].compareTo("Lookup")==0)
            {
                String searchName=strArray[1];
                a.lookup(searchName);

            }

            else if (strArray[0].compareTo("See")==0)
            {

                a.see();
                //System.out.println("a.current is "+a.current);


            }

            else if (strArray[0].compareTo("INC")==0)
            {
                a.increment();
            }

            else if (strArray[0].compareTo("Change")==0)
            {
                String type=strArray[1];
                double rate=Double.parseDouble(strArray[2]);
                a.change(type, rate);
            }


            else
            {
                System.out.println("Invalid Command");
                System.out.println(strArray[0]);
            }

        }
    }
}
