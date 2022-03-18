package com.starbuzzz.koffemenu;

public abstract class BeverageExtra extends Beverage {

    private Beverage beverage;

    public BeverageExtra(Beverage beverage, String description) {
        super(description);
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", " + super.getDescription();
    }

}
