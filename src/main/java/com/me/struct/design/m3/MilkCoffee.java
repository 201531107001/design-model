package com.me.struct.design.m3;

/**
 * 牛奶咖啡
 * @author 清明
 *
 */
public class MilkCoffee extends CoffeeDecorator{

    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+1;
    }

    @Override
    public String getName() {
        return "牛奶"+coffee.getName();
    }
}
