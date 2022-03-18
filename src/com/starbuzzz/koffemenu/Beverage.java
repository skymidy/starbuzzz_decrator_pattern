package com.starbuzzz.koffemenu;

public abstract class Beverage {

    private String description;

    public Beverage(String description)
    {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
