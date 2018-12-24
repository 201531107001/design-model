package com.me.create.design.m5;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("gqm", "123456" ,new Birth(1999,02,19));
        Student s2 = s1.clone();
        System.out.println(s2);

        System.out.println(s1);
    }
}
