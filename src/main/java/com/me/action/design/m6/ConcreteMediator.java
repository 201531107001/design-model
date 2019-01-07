package com.me.action.design.m6;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ConcreteMediator implements Mediator{
    private Colleague1 c1;
    private Colleague2 c2;

    @Override
    public void colleagueChanged12() {
        System.out.println("this is an change from Colleague1");
        c2.changeAfterc1();
    }
    
    @Override
    public void colleagueChanged21() {
        System.out.println("this is an change from Colleague2");
        c1.changeAfterc2();
    }
    
    public void createColleagues() {
        c1 = new Colleague1(this);
        c2 = new Colleague2(this);
    }

}
