package com.me.action.design.m1;

public abstract class DoDishTemplate {
    /**
     * 具体的整个过程
     */
    public void dodish() {
        this.preparation();
        this.doing();
        this.carriedDishes();
    }

    /**
     * 备料
     */
    protected abstract void preparation();

    /**
     * 做菜
     */
    protected abstract void doing();

    /**
     * 上菜
     */
    protected abstract void carriedDishes();
}
