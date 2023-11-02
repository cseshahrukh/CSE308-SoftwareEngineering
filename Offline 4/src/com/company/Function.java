package com.company;

public class Function {

    public String func3credit(String str)
    {
        double floatmarks;
        try{
            floatmarks=Float.valueOf(str);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Not A Number");
        }
        //-.5 pele oita 0 korar agei exception throw kore dibo
        if (floatmarks<0)
            throw new RuntimeException("Invalid Input. Input can't be negative.");
        double marks;
        marks=Math.ceil(floatmarks);
        if(marks>=240 && marks<=300)
            return "A";
        if(marks>=210 && marks<=239)
            return "B";
        if(marks>=180 && marks<=209)
            return "C";
        if(marks>=0 && marks<=179)
            return "F";
        else
            throw new RuntimeException("Invalid Input. Input is too large.");


    }

    public String func4credit(String str)
    {
        double floatmarks;
        try{
            floatmarks=Float.valueOf(str);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Not A Number");
        }
        //-.5 pele oita 0 korar agei exception throw kore dibo
        if (floatmarks<0)
            throw new RuntimeException("Invalid Input. Input can't be negative.");
        double marks;
        marks=Math.ceil(floatmarks);
        if(marks>=320 && marks<=400)
            return "A";
        if(marks>=280 && marks<=319)
            return "B";
        if(marks>=240 && marks<=279)
            return "C";
        if(marks>=0 && marks<=179)
            return "F";
        else
            throw new RuntimeException("Invalid Input. Input is too large.");

    }

}
