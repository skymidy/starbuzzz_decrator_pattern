package com.starbuzzz.koffemenu;

public class Espresso extends Beverage {

    public Espresso() {
        super("Espresso");
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
