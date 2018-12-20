package com.me.create.design.m2;

public class Main {
    public static void main(String[] args) {
        AbstractFactory haiEr = new HaiEr();
        haiEr.createBingXiang().describe();
        haiEr.createTongTiao().describe();
        
        System.out.println("=======================================");
        
        AbstractFactory geLi = new GeLi();
        geLi.createBingXiang().describe();
        geLi.createTongTiao().describe();
    }
}
