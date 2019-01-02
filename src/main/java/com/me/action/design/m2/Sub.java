package com.me.action.design.m2;

public class Sub implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
