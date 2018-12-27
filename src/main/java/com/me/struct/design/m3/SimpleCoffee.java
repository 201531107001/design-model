package com.me.struct.design.m3;

public class SimpleCoffee implements Coffee{

    @Override
    public int getPrice() {
        return 2;
    }

    @Override
    public String getName() {
        return "纯咖啡";
    }

}
