package com.me.struct.design.m7;

public class Main {
    public static void main(String[] args) {
        BuyHouse buyHouse = new ConcreteBuyHouse();
        BuyHouseProxy proxy = new BuyHouseProxy(buyHouse);
        proxy.buyHouse();
    }
}
