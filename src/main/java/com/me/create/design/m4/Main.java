package com.me.create.design.m4;

public class Main {
    public static void main(String[] args) {
        Builder builder = new StudentBuilder();
        Director director = new Director(builder);
        Student student = director.construct();
        System.out.println(student.getName());
    }
}
