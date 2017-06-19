package com.company;

/**
 * Created by Patryk on 2017-06-19.
 */
public abstract class ColdDrink implements Item {

    public Packing packing(){

        return new Bottle();
    }
}
