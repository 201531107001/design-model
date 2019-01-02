package com.me.action.design.m2;

public class Main {
    public static void main(String[] args) {
        Strategy add = new Add();
        Strategy sub = new Sub();
        
        Context context = new Context(sub);
        System.out.println(context.calcuate(5, 2));
    }
}
