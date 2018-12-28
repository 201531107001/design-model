package com.me.struct.design.m4;


public abstract class Component {
    
    protected String name;
    protected int lavel;
    
    public Component(String name,int lavel) {
        this.name = name;
        this.lavel = lavel;
    }
    
    void add(Component component) {
        
    }
    
    void remove(Component component) {
        
    }
    abstract void display();
}
