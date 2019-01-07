package com.me.action.design.m6;

class Colleague2 extends Colleague {
    
    public Colleague2(Mediator m) {
        super(m);
    }

    @Override
    public void action() {
        System.out.println("this is an action from Colleague2");
    }
    
    public void changeAfterc1() {
        System.out.println("this is an change from Colleague2 after c1 change");
    }
    
    @Override
    public void change() {
        mediator.colleagueChanged21();
    }
}

