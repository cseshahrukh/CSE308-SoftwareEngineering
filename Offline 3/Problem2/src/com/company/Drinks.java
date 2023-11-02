package com.company;
//Appetizer is a decorator
public abstract class Drinks implements Burger{
    Burger burger;

    public Drinks(Burger burger)
    {
        this.burger=burger;
    }
    public abstract String getDescription();

    public int getCost(){
        return burger.getCost(); //This price is actually the prize without the drinks
    }
}
