package com.company;

public class atmega32 implements microcontroller{

    int price=1000;
    public atmega32()
    {
        create();
    }

    public void create(){
        System.out.println("atmega32 created");
    }

    public int getPrice() {
        return price;
    }
}
