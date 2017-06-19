package com.company;

/**
 * Created by Patryk on 2017-06-19.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public int price() {
        return 25;
    }
}
