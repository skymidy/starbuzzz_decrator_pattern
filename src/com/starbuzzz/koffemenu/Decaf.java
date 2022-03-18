package com.starbuzzz.koffemenu;

public class Decaf extends Beverage {

    public Decaf() {
        super("Decaf");
    }

    @Override
    public double getCost() {
        return 3.99;
    }
}
