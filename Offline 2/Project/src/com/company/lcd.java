package com.company;

public class lcd implements display{
    int price=300;
    public lcd()
    {
        create();
    }
    public void create(){
        System.out.println("LCD created");
    }

    public int getPrice() {
        return price;
    }
}
