package com.me.struct.design.m2;

public class Main {
    public static void main(String[] args) {
        EnglishPeople english = new EnglishPeople();
        ObjectAdapter objectAdapter = new ObjectAdapter(english);
        System.out.println(objectAdapter.speakChinese("i love you"));
        
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println(classAdapter.speakChinese("i love you"));
    }
}
