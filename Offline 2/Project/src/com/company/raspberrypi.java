package com.company;

public class raspberrypi implements microcontroller{
    int price=3000;
    public raspberrypi(){
        create();
    }
    public void create()
    {
        System.out.println("Raspberrypi got");
    }

    public int getPrice() {
        return price;
    }
}
