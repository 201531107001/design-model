package com.me.action.design.m4;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        PerimterObserver perimterObserver = new PerimterObserver();
        AreaObserver areaObserver = new AreaObserver();
        
        // 注册观察者
        subject.addObserver(perimterObserver);
        subject.addObserver(areaObserver);
        
        subject.setRedius(1);
        System.out.println("========================================================");
        subject.setRedius(2);
        
    }
    
}
