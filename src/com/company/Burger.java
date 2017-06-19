package com.company;

/**
 * Created by Patryk on 2017-06-19.
 */
public abstract class Burger implements Item {

    public Packing packing(){

        return new Wrapper();
    }

}
