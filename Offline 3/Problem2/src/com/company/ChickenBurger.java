package com.company;

public class ChickenBurger implements Burger {

    @Override
    public String getDescription() {
        return "Chicken Burger";
    }

    public int getCost()
    {
        return 400;
    }
}
