package com.company;

public class editor {
    font f;
    parser p;
    environment w;

    public editor(parser pp, font ff, environment ww)
    {
        p=pp;
        f=ff;
        w=ww;

    }

    void print(){
        //System.out.println(p);

        //System.out.println("Inside print function");
        System.out.println("Parser is "+p.getparsername());
        System.out.println("Font is "+f.getfontname());
        System.out.println("Environment is "+w.getenvironmentname());
    }
}
