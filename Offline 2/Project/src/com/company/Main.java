package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Select name of the system");
        System.out.println("1. Deluxe");
        System.out.println("2. Optimal");
        System.out.println("3. Poor");

        Scanner sc=new Scanner(System.in);
        int num;
        String name="";
        num=sc.nextInt();

        if(num==1)
            name="deluxe";
        else if (num==2)
            name="optimal";
        else if (num==3)
            name = "poor";

        System.out.println("Choose net Connection");
        System.out.println("1. Wifi");
        System.out.println("2. Mobile");

        String net="";
        num=sc.nextInt();
        if(num==1)
            net="wifi";
        else if (num==2)
            net="mobile";

        factory f=new factory(name);
        system s=f.produce(net, num);












        
    }
}
