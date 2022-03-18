package com.starbuzzz.koffemenu;

public class Mocha extends BeverageExtra{

    public Mocha(Beverage beverage) {
        super(beverage, "Mocha");
    }

    @Override
    public double getCost() {
        return 2.99 + getBeverage().getCost();
    }
}
