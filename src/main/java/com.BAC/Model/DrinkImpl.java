package com.BAC.Model;

public class DrinkImpl implements Drink{
    private String name;
    private double ounces;
    private double volume;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getOunces() {
        return this.ounces;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setOunces(double ounces) {
        this.ounces = ounces;
    }
}
