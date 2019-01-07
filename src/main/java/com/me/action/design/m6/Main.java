package com.me.action.design.m6;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createColleagues();
        
        Colleague c1 = mediator.getC1();
        Colleague c2 = mediator.getC2();
        
        c1.action();
        System.out.println("=========================================");
        c1.change();
        
        System.out.println("--------------------------------------");
        
        c2.action();
        System.out.println("=========================================");
        c2.change();
    }
}
