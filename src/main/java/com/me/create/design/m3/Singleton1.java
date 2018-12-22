package com.me.create.design.m3;

/**
 * 单例模式 饿汉式
 * @author 郭清明
 *
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();
    
    private Singleton1() {

    }
    
    public static Singleton1 getInstance(){
        return singleton;
    }
}
