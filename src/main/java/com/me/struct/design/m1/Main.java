package com.me.struct.design.m1;

public class Main {
    public static void main(String[] args) {
        Color red = new Red();
        Shape square = new Square();
        square.setColor(red);
        square.draw();
    }
}
