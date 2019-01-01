package com.me.action.design.m1;

public class HongShaoRou extends DoDishTemplate{

    @Override
    protected void preparation() {
        System.out.println("切猪肉，准备好糖");
    }

    @Override
    protected void doing() {
        System.out.println("将肉放入锅中，放入糖，炒");
    }

    @Override
    protected void carriedDishes() {
        System.out.println("红烧肉做好了，上菜");
    }

}
