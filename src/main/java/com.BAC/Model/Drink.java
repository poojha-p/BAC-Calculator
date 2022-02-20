package com.BAC.Model;

import java.time.Instant;

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

    Instant getTime();

    double getHour();

}
