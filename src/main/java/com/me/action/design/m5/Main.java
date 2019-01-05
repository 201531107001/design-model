package com.me.action.design.m5;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        
        originator.setValue("one");
        System.out.println(originator.getValue());
        
        Memento memento = originator.createMemento();
        
        originator.setValue("two");
        System.out.println(originator.getValue());
        
        originator.restoreMenento(memento);
        System.out.println(originator.getValue());
    }
}
