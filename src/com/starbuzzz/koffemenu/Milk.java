package com.starbuzzz.koffemenu;

public class Milk extends BeverageExtra{

    public Milk(Beverage beverage) {
        super(beverage, "Milk");
    }

    @Override
    public double getCost() {
        return 1.99 + getBeverage().getCost();
    }
}
