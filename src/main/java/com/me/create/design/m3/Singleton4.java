package com.me.create.design.m3;

/**
 * 懒汉双重校验锁
 * @author 清明
 *
 */
public class Singleton4 {
    private static Singleton4 singleton = null;
    
    private Singleton4() {
        
    }
    
    public static Singleton4 getInstanse() {
        if(singleton == null) {
            synchronized (Singleton4.class) {
                if(singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        
        return singleton;
    }
}
