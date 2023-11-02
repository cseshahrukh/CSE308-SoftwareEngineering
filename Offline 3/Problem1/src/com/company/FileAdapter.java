package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAdapter {
    SpaceFileAdaptee spaceFileAdaptee;

    public FileAdapter()
    {
        spaceFileAdaptee = new SpaceFileAdaptee();
    }

    public void getSum(File filename) throws IOException {
        //System.out.println("Inside fileadapterget sum");
        //File.createTempFile("temp", "txt");

        FileReader fin = new FileReader(filename);
        FileWriter fout = new FileWriter("temp.txt");


        int c;
        while((c=fin.read())!=-1)
        {
            //System.out.println("C is "+ c);
            if(c!='_')
            {
                fout.write(c);
            }
            else
                fout.write(' ');

        }

        fout.close();


        File f=new File("temp.txt");
        spaceFileAdaptee.getSum(f);
        fin.close();
        //fout.close();
        f.delete();



    }
}
