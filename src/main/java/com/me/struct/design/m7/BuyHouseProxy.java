package com.me.struct.design.m7;

public class BuyHouseProxy implements BuyHouse{
    
    private BuyHouse buyHouse;
    
    public BuyHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("中介找房");
        buyHouse.buyHouse();
        System.out.println("装修房");
    }

}
