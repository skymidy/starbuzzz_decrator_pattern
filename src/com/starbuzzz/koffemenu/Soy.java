package com.starbuzzz.koffemenu;

public class Soy extends BeverageExtra{

    public Soy(Beverage beverage) {
        super(beverage, "Soy");
    }

    @Override
    public double getCost() {
        return .99 + getBeverage().getCost();
    }
}
