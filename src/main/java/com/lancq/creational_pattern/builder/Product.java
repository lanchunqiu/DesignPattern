package com.lancq.creational_pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品
 */
public class Product {
    private List<String> parts = new ArrayList();

    public void addPart(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("Product:");
        for(int i = 0; i < parts.size(); i++){
            String part = parts.get(i);
            System.out.println(part);
        }
    }
}
