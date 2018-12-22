package com.me.create.design.m3;

/**
 * 懒汉加锁式 -- 每次获取都要获取释放锁，浪费性能
 * @author 清明
 *
 */
public class Singleton3 {
    private static Singleton3 singleton = null;
    
    private Singleton3() {
        
    }
    
    public synchronized static Singleton3 getInstanse() {
        if(singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}
