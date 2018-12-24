package com.me.create.design.m5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Cloneable{
    private String name;
    private String password;
    private Birth birth;
    
    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        // 深克隆的关键
        student.birth = new Birth(1992,10,15);
        return student;
    }
}
