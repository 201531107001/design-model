package com.me.struct.design.m2;

/**
 * 类适配器
 * 
 * @author 清明
 *
 */
public class ClassAdapter implements Chinese, English {

    @Override
    public String speakEnglish(String str) {
        return str;
    }

    @Override
    public String speakChinese(String str) {
        return "翻译："+speakEnglish(str);
    }

}
