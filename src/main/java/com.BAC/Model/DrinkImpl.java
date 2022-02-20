package com.BAC.Model;

import java.util.ArrayList;

public class DrinkImpl implements Drink{
    protected String name;
    protected double ounces;
    protected double volume;
    protected ArrayList<Drink> drinks;
    protected int num_drinks = 0;

    public DrinkImpl(String name, double ounces, double volume) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        if (ounces < 0) {
            throw new IllegalArgumentException();
        }
        if (volume < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.ounces = ounces;
        this.volume = volume;
        this.num_drinks ++;
    }

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

    @Override
    public int getNumDrinks() {
        return 0;
    }

    @Override
    public void addDrink(Drink drink) {

    }
}
