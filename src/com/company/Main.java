package com.company;

public class Main {

    public static void main(String[] args) {

        Meal meal;

        MealBuilder meal1 = new MealBuilder();

        meal1.prepareBeefBurger();

        meal1.getMeal().showItems();


        System.out.println("Meal Cost: " + meal1.getMeal().getCost());

        System.out.println("--------------------");

        MealBuilder meal2 = new MealBuilder();

        meal2.prepareChickenBurger();

        meal2.getMeal().showItems();

        System.out.println("Meal Cost: " + meal2.getMeal().getCost());



    }
}
