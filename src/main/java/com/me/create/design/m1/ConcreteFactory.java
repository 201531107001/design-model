package com.me.create.design.m1;

/**
 * 工厂具体实现
 * @author 清明
 *
 */
public class ConcreteFactory implements Factory{

    @Override
    public Car getJeep() {
        return new Jeep();
    }

    @Override
    public Car getTruck() {
        return new Truck();
    }

}
