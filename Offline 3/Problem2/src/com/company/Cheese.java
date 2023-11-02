package com.company;

public class Cheese implements Burger{
    Burger burger;

    public Cheese(Burger burger)
    {
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+", Cheese";
    }

    public int getCost()
    {
        return 20+burger.getCost();
    }
}