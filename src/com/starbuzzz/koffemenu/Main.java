package com.starbuzzz.koffemenu;

public class Main {

    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();
        System.out.printf("%s: %f\n", beverage1.getDescription(), beverage1.getCost());

        Beverage beverage2 = new Decaf();
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.printf("%s: %f\n", beverage2.getDescription(), beverage2.getCost());
    }
}
