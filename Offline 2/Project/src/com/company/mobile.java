package com.company;

public class mobile implements communication{
    int price=50;
    public mobile()
    {
        create();
    }

    public void create(){
        System.out.println("Mobile Net Set");
    }

    public int getPrice() {
        return price;
    }
}
