package com.me.struct.design.m4;

public class Leaf extends Component{
    
    public Leaf(String name,int lavel) {
        super(name,lavel);
    }

    @Override
    void display() {
        System.out.println(name);
    }
}
