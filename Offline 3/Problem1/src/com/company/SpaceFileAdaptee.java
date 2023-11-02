package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SpaceFileAdaptee {

    int sum=0;
    public SpaceFileAdaptee()
    {
    }

    public void getSum(File file) throws IOException {
        //System.out.println("Inside Space File adaptee getSum Filename is "+ filename);
        Scanner scanner = new Scanner(file);



        while (scanner.hasNextInt()) {
            int In_Value = scanner.nextInt();
            // Print the Integer
            //System.out.println(In_Value);
            sum+=In_Value;
        }
        System.out.println(sum);
    }

}
