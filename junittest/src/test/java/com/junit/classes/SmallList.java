package com.junit.classes;

import java.util.ArrayList;
import java.util.List;

public class SmallList {
    List<String> fruits = new ArrayList<String>();


    public void fillList(String n){
        fruits.add(n);
    }

    public String getItem(int n){
        return fruits.get(n);
    }
}
