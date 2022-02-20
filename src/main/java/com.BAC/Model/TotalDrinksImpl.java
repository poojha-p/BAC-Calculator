package com.BAC.Model;

import java.util.ArrayList;

public class TotalDrinksImpl implements TotalDrinks{
    protected int num;
    protected ArrayList<Drink> totaldrinks;

    public TotalDrinksImpl(){
        this.num = 0;
        this.totaldrinks = new ArrayList<>();
    }

    @Override
    public int getNumDrinks() {
        return this.num;
    }

    @Override
    public void addDrink(Drink drink) {
        this.totaldrinks.add(drink);
        this.num++;
    }

}
