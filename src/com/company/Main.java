package com.company;

public class Main {

    public static void main(String[] args) {

        Meal meal;

        MealBuilder meal1 = new MealBuilder();

        meal1.prepareBeefBurger();

        meal = meal1.getMeal();

        meal.showItems();

        System.out.println("Meal Cost: " + meal.getCost());

        System.out.println("--------------------");

        MealBuilder meal2 = new MealBuilder();

        meal2.prepareChickenBurger();

        meal = meal2.getMeal();

        meal.showItems();

        System.out.println("Meal Cost: " + meal.getCost());



    }
}
