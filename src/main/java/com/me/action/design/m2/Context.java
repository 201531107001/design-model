package com.me.action.design.m2;

public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public int calcuate(int a,int b) {
        return strategy.calculate(a, b);
    }
}
