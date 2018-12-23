package com.me.create.design.m4;

public class Main2 {
    public static void main(String[] args) {
        Student student = new StudentBuilder2()
                            .name("gqm")
                            .password("123456")
                            .age(19)
                            .build();
        System.out.println(student.getName());
    }
}
