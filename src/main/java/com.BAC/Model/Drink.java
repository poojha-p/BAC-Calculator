package com.BAC.Model;

public interface Drink {

    /** name of drink **/
    String getName();

    /** ounces of drink **/
    double getOunces();

    /** volume of drink **/
    double getVolume();

    /** set volume of drink **/
    void setVolume(double volume);

    /** set name **/
    void setName(String name);

    /** set ounces **/
    void setOunces(double ounces);

    int getNumDrinks();

    void addDrink(Drink drink);

}
