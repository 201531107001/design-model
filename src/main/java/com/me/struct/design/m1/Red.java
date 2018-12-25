package com.me.struct.design.m1;

public class Red implements Color{

    @Override
    public void paint(String shape) {
        System.out.println("红色的"+shape);
    }

}
