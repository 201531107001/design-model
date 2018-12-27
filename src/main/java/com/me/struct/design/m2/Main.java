package com.me.struct.design.m2;

public class Main {
    public static void main(String[] args) {
        EnglishPeople english = new EnglishPeople();
        Chinese chinese1 = new ObjectAdapter(english);
        System.out.println(chinese1.speakChinese("i love you"));
        
        Chinese chinese2 = new ClassAdapter();
        System.out.println(chinese2.speakChinese("i love you"));
    }
}
