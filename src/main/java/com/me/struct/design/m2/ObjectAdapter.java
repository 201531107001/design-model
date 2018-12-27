package com.me.struct.design.m2;

/**
 * 对象适配器
 * 
 * @author 清明
 *
 */
public class ObjectAdapter implements Chinese {
    private EnglishPeople english;

    public ObjectAdapter(EnglishPeople english) {
        this.english = english;
    }

    @Override
    public String speakChinese(String str) {
        return "翻译："+english.speakEnglish(str);
    }

}
