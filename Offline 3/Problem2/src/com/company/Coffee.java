package com.company;

public class Coffee extends Drinks{
    public Coffee(Burger burger)
    {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+", Coffee";
    }

    public int getCost()
    {
        return 50+super.getCost();
    }
}