package com.me.create.design.m2;

/**
 * 海尔具体工厂
 * @author 清明
 *
 */
public class HaiEr implements AbstractFactory{

    @Override
    public KongTiao createTongTiao() {
        return new HaiErKongTiao();
    }

    @Override
    public BingXiang createBingXiang() {
        return new HaiErBingXiang();
    }

}
