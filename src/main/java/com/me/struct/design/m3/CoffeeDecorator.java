package com.me.struct.design.m3;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;
    
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
