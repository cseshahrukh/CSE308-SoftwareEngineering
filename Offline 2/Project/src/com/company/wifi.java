package com.company;

public class wifi implements communication{
    int price=100;
    public wifi()
    {
        create();
    }
    public void create(){
        System.out.println("Wifi connected");
    }

    public int getPrice() {
        return price;
    }
}
