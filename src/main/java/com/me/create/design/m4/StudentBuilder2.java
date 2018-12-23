package com.me.create.design.m4;

/**
 * builder模式的一种变形
 * @author 清明
 *
 */
public class StudentBuilder2 {
    Student student = null;
    
    public StudentBuilder2() {
        student = new Student();
    }
    
    public StudentBuilder2 name(String name) {
        student.setName(name);
        return this;
    }
    
    public StudentBuilder2 age(int age) {
        student.setAge(age);
        return this;
    }
    
    public StudentBuilder2 password(String password) {
        student.setPassword(password);
        return this;
    }
    
    public Student build() {
        return student;
    }
}
