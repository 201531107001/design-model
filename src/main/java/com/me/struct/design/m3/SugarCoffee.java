package com.me.struct.design.m3;

/**
 * 加糖咖啡
 * @author 清明
 *
 */
public class SugarCoffee extends CoffeeDecorator{

    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+1;
    }

    @Override
    public String getName() {
        return "加糖"+coffee.getName();
    }

}
