package com.company;

public class VeggiBurger implements Burger {

    @Override
    public String getDescription() {
        return "Veggi Burger";
    }

    public int getCost()
    {
        return 250;
    }
}
