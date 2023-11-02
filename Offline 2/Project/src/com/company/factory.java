package com.company;

public class factory {

    private builder b;
    public int price=0;

    public factory(String name)
    {
        if(name.equals("deluxe"))
        {
            b=new deluxebuilder();
        }
        else if (name.equals("optimal"))
        {
            b=new optimalbuilder();
        }
        else if(name.equals("poor"))
        {
            b=new poorbuilder();
        }
    }

    public system produce (String net, int num)
    {
        //this.price=b.getPrice();
        return b.build(net, num);
    }
}
