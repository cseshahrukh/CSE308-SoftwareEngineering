package com.telusko;

public class Subscriber implements Observer {
    private String name;
    private Channel channel=new Channel();

    @Override
    public void update(){
        System.out.println("Hey "+name+" Video uploaded "+channel.title);
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void subscribeChannel(Channel ch)
    {
        channel=ch;
    }
}
