package com.me.action.design.m1;

public class HongShaoRou extends DoDishTemplate{

    @Override
    public void preparation() {
        System.out.println("切猪肉，准备好糖");
    }

    @Override
    public void doing() {
        System.out.println("将肉放入锅中，放入糖，炒");
    }

    @Override
    public void carriedDishes() {
        System.out.println("红烧肉做好了，上菜");
    }

}
