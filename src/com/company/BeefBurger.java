package com.company;

/**
 * Created by Patryk on 2017-06-19.
 */
public class BeefBurger extends Burger {

    @Override
    public String name() {
        return  "Beef burger";
    }

    @Override
    public int price() {
        return 195;
    }
}