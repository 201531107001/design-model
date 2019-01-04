package com.me.action.design.m4;

import java.util.Observable;
import java.util.Observer;

/**
 * 圆的周长观察者
 * @author 清明
 *
 */
public class PerimterObserver implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        Subject subject = (Subject)o;
        System.out.println("当前圆的周长为"+subject.getRedius()*2*Math.PI);
    }

}
