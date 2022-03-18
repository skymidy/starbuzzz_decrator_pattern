package com.starbuzzz.koffemenu;

public class Whip extends BeverageExtra{

    public Whip(Beverage beverage) {
        super(beverage, "Whip");
    }

    @Override
    public double getCost() {
        return .99 + getBeverage().getCost();
    }
}
