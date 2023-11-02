package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Burger burger1=new BeefBurger();
        burger1=new FrenchFry(burger1);
        burger1=new Cheese(burger1);
        System.out.println(burger1.getDescription());
        System.out.println("Cost is "+ burger1.getCost());


        Burger burger2=new VeggiBurger();
        burger2=new OnionRings(burger2);
        burger2=new Water(burger2);
        System.out.println(burger2.getDescription());
        System.out.println("Cost is "+ burger2.getCost());

        Burger burger3=new VeggiBurger();
        burger3=new FrenchFry(burger3);
        burger3=new Coke(burger3);
        System.out.println(burger3.getDescription());
        System.out.println("Cost is "+ burger3.getCost());

        Burger burger4=new VeggiBurger();
        burger4=new OnionRings(burger4);
        burger4=new Coffee(burger4);
        burger4=new Water(burger4);
        System.out.println(burger4.getDescription());
        System.out.println("Cost is "+ burger4.getCost());

        Burger burger5=new BeefBurger();
        System.out.println(burger5.getDescription());
        System.out.println("Cost is "+ burger5.getCost());

    }
}
