package com.me.create.design.m3;

/**
 * 枚举类型实现单例
 * @author 清明
 *
 */
public enum Singleton6 {
    instanse;
    
    private Singleton6() {
        
    }
    
    public static Singleton6 getInstanse() {
        return instanse;
    }
}
