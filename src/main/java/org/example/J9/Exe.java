package org.example.J9;

import java.util.ArrayList;

public class Exe {
    public static void execute(){

        try {
            System.out.println("Print Items where price is over 1");

            ArrayList<Item> items = ItemsDAO.findByMinimumPrice(1);
            items.forEach(item -> System.out.printf("%12s%4d%4d\n", item.getName(), item.getPrice(), item.getWeight()));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
