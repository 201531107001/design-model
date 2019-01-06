package com.me.action.design.m6;

public class Colleague1 extends Colleague {
    public Colleague1(Mediator m) {
        super(m);
    }

    public void action() {
        System.out.println("this is an action from Colleague1");
    }
}

