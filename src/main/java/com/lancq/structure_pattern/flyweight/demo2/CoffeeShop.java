package com.lancq.structure_pattern.flyweight.demo2;

import java.util.ArrayList;

public class CoffeeShop {
    private final ArrayList<Order> orders = new ArrayList<>();

    public void takeOrder(String flavour, int tableNumber) {
        orders.add(Order.of(flavour, tableNumber));
    }

    public void service() {
        orders.forEach(Order::serve);
    }
}
