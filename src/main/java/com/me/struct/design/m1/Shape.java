package com.me.struct.design.m1;

public abstract class Shape {
    protected Color color;
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    abstract void draw();
}
