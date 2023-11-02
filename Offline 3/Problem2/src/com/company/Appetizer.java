package com.company;
//Appetizer is a decorator
public abstract class Appetizer implements Burger{
    Burger burger;

    public Appetizer(Burger burger)
    {
        this.burger=burger;
    }
    public abstract String getDescription();

    public int getCost(){
        return burger.getCost();
    }
}
