package com.me.create.design.m1;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Car jeep = factory.getJeep();
        Car truck = factory.getTruck();
        jeep.describe();
        truck.describe();
    }
}
