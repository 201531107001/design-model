package com.me.create.design.m3;

/**
 * 单例模式 懒汉式
 * @author 清明
 *
 */
public class Singleton2 {
    private static Singleton2 singleton = null;
    
    private Singleton2() {
        
    }
    
    public static Singleton2 getInstanse() {
        if(singleton == null) {
            singleton = new Singleton2();
        }
        
        return singleton;
    }
}
