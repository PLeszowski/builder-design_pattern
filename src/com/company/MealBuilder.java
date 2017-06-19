package com.company;

/**
 * Created by Patryk on 2017-06-19.
 */
public class MealBuilder {

    private Meal meal;

    public MealBuilder() {
        this.meal = new Meal();
    }

    public Meal prepareBeefBurger(){

        meal.addItem(new BeefBurger());
        meal.addItem(new Coke());

        return meal;

    }

    public Meal prepareChickenBurger(){

        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;

    }

    public Meal getMeal() {
        return meal;
    }
}
