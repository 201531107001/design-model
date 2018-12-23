package com.me.create.design.m4;

public class StudentBuilder implements Builder{
    Student student = null;
    
    public StudentBuilder() {
        student = new Student();
    }

    @Override
    public void name(String name) {
        student.setName(name);
    }

    @Override
    public void password(String password) {
        student.setPassword(password);
    }

    @Override
    public void age(int age) {
        student.setAge(age);
    }
    
    @Override
    public Student getStudent() {
        return student;
    }
}
