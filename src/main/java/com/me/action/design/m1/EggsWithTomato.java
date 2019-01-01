package com.me.action.design.m1;

public class EggsWithTomato extends DoDishTemplate{

    @Override
    protected void preparation() {
        System.out.println("洗西红柿，切西红柿，打鸡蛋");
    }

    @Override
    protected void doing() {
        System.out.println("倒油炒西红柿和鸡蛋");
    }

    @Override
    protected void carriedDishes() {
        System.out.println("西红柿炒鸡蛋做好了上菜");
    }

}
