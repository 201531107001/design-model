package com.me.create.design.m2;

/**
 * 格力具体工厂
 * @author 清明
 *
 */
public class GeLi implements AbstractFactory{

    @Override
    public KongTiao createTongTiao() {
        return new GeLiKongTiao();
    }

    @Override
    public BingXiang createBingXiang() {
        return new GeLiBingXiang();
    }

}
