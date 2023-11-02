package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String name="";
        name=sc.next();

        editorconnection connection=new editorconnection(name);


        if(connection.getE()!=null)
            connection.getE().print();
    }
}
