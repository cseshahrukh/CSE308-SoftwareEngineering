package com.company;

public class FrenchFry extends Appetizer{
    public FrenchFry(Burger burger)
    {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+", French Fry";
    }

    public int getCost()
    {
        return 100+super.getCost();
    }
}
