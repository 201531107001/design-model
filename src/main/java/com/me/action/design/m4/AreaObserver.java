package com.me.action.design.m4;

import java.util.Observable;
import java.util.Observer;
/**
 * 圆的面积观察者
 * @author 清明
 *
 */
public class AreaObserver implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        Subject subject = (Subject)o;
        System.out.println("当前圆的面积为"+subject.getRedius()*subject.getRedius()*Math.PI);        
    }
}
