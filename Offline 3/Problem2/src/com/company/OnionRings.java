package com.company;

public class OnionRings extends Appetizer{
    public OnionRings(Burger burger)
    {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+", OnionRings";
    }

    public int getCost()
    {
        return 100+super.getCost();
    }
}