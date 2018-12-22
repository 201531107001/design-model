package com.me.create.design.m3;

/**
 * 静态内部类实现单例
 * @author 清明
 *
 */
public class Singleton5 {
    
    private Singleton5() {
        
    }
    
    public static Singleton5 getInstanse() {
        return SingletonInstanse.singleton;
    }
    
    private static class SingletonInstanse{
        private static Singleton5 singleton = new Singleton5();
    }
}
