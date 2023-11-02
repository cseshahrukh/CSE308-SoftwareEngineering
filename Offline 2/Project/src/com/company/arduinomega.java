package com.company;

public class arduinomega implements microcontroller{
    int price=2000;

    public arduinomega()
    {

        create();
    }
    public void create(){
        System.out.println("arduino create");
    }

    public int getPrice() {
        return price;
    }
}
