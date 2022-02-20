package com.BAC.Model;

public class BACImpl implements BAC{
    protected Drink drink;
    protected Time time;
    protected Person person;
    protected double BAC;

    public BACImpl(Drink drink, Time time, Person person) {
        this.drink = drink;
        this.time = time;
        this.person = person;
        this.BAC = 0;
    }

    @Override
    public double calculateBAC(Drink drink, Time time) {
        double grams = this.drink.getOunces() * this.drink.getVolume() * 0.789;
        double r = 0;
        if(this.person.getGender().contentEquals("FEMALE")) {
            r = 0.55;
        } else if (this.person.getGender().contentEquals("MALE")) {
            r = 0.68;
        }
        double bac = (grams/ (this.person.getWeight() * r)) * 100;
        bac = bac - (this.time.timeElapsed(this.time.getStart(),this.time.getEnd()) * 0.015);
        return bac;
    }
}
