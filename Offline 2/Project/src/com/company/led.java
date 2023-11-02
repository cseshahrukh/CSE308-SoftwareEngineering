package com.company;

public class led implements display{
    int price=200;
    public led() {
        create();
    }

    @Override
    public void create() {
        System.out.println("LED Created");
    }

    public int getPrice() {
        return price;
    }
}
