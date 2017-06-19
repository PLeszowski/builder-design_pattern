package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patryk on 2017-06-19.
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public int getCost(){
        int total = 0;

        for (Item item: itemList) {
            total = total + item.price();
        }

        return total;
    }

    public void showItems(){

        System.out.println("Item in meal:");

        for (Item item: itemList) {
            System.out.println("-" + item.name());
        }
    }
}
