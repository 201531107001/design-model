package com.me.struct.design.m3;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getName()+":"+coffee.getPrice());
        
        coffee = new MilkCoffee(coffee);
        System.out.println(coffee.getName()+":"+coffee.getPrice());
        
        coffee = new SugarCoffee(coffee);
        System.out.println(coffee.getName()+":"+coffee.getPrice());
    }
}
