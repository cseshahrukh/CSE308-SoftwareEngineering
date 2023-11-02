package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        File file=new File("text.txt");

        System.out.println("Type \"space\" or \"underscore\" as file type");
        String type=scanner.next();

        FileType fileType=new FileType();
        fileType.getSum(file, type);


    }
}
