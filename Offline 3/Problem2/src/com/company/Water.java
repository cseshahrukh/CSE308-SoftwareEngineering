package com.company;

public class Water extends Drinks{
    public Water(Burger burger)
    {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+", Water";
    }

    public int getCost()
    {
        return 20+super.getCost();
    }
}