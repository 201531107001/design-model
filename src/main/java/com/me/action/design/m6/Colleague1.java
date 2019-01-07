package com.me.action.design.m6;

public class Colleague1 extends Colleague {
    public Colleague1(Mediator m) {
        super(m);
    }

    @Override
    public void action() {
        System.out.println("this is an action from Colleague1");
    }
    
    public void changeAfterc2() {
        System.out.println("this is an change from Colleague1 after c2 change");
    }
    
    @Override
    public void change() {
        mediator.colleagueChanged12();
    }
}
