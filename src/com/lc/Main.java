package com.lc;

import com.lc.Restaurant.MenuItem;
import com.lc.Restaurant.Menu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date today = Calendar.getInstance().getTime();
        MenuItem item1 = new MenuItem("Spaghetti", "Tasty noodles", 10.99, "Dinner", false, today);
        MenuItem item2 = new MenuItem("Breadsticks", "Baked garlicky goodness", 4.99, "Appetizer/Side", true, today);
        MenuItem item3 = new MenuItem("Pizza", "The Classic", 8.99, "Lunch", false, today);

        ArrayList<MenuItem> menu = new ArrayList<>();

        Menu lunchMenu = new Menu(today, menu);

        lunchMenu.addItem(item1);
        lunchMenu.addItem(item2);
        lunchMenu.addItem(item3);

        lunchMenu.printMenu();


    }
}
