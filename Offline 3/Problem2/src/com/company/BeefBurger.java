package com.company;

public class BeefBurger implements Burger{

    @Override
    public String getDescription() {
        return "Beef Burger";
    }

    public int getCost()
    {
        return 400;
    }

}
