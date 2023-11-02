package com.company;

public class Coke extends Drinks{
    public Coke(Burger burger)
    {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+", Coke";
    }

    public int getCost()
    {
        return 30+super.getCost();
    }
}