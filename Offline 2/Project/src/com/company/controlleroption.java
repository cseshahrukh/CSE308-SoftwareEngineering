package com.company;

public class controlleroption implements controller{
    int price=20;
    public controlleroption(){
        create();
    }

    public void create()
    {
        System.out.println("Controller Created");
    }

    public int getPrice() {
        return price;
    }



}
