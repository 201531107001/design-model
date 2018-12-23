package com.me.create.design.m4;

public class Director {
    Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public Student construct() {
        builder.name("gqm");
        builder.password("123456");
        builder.age(19);
        return builder.getStudent();
    }
}
