package com.me.action.design.m7;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(new ConcreteCommend(receiver));
        invoker.execute();
    }
}
