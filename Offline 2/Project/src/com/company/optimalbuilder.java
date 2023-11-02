package com.company;

import java.util.ArrayList;

public class optimalbuilder implements builder{
    private components microcontroller1, display1, net1, controller1;
    int noofdisplay;
    private ArrayList<components> componentlist;
    private system result;
    public int productPrice=0;


    public system build(String net, int amount)
    {
        componentlist = new ArrayList<>();

        microcontroller1=new arduinomega();
        System.out.println("Microcontroller RaspBerry Pi is "+ microcontroller1.getPrice());
        productPrice+=microcontroller1.getPrice();


        componentlist.add(microcontroller1);
        noofdisplay=amount;
        for(int i=0; i<noofdisplay; i++)
        {
            display1=new led();
            componentlist.add(display1);
        }

        System.out.println("Display LED Per Price is "+display1.getPrice());
        System.out.println("Cost for display is "+display1.getPrice()*noofdisplay);
        productPrice+=display1.getPrice()*noofdisplay;

        if(net.equals("wifi"))
        {
            net1=new wifi();
            System.out.println("Price for wifi is "+net1.getPrice());
            productPrice+=net1.getPrice();
        }
        else if (net.equals("mobile"))
        {
            net1=new mobile();
            System.out.println("Price for mobilenet is "+net1.getPrice());
            productPrice+=net1.getPrice();
        }
        componentlist.add(net1);


        controller1=new controlleroption(); //2
        componentlist.add(controller1);
        System.out.println("Controller Price is"+ controller1.getPrice());

        System.out.println("year cost is "+yearcost.getPrice());
        productPrice+=yearcost.getPrice();

        System.out.println("Total Price is "+productPrice);

        result=new system(componentlist);
        return result;
    }



}
