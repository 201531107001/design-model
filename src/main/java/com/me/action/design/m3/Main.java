package com.me.action.design.m3;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.changeState(DayState.getInstanse());
        
        for(int i=0;i<=23;i++) {
            context.setClock(i);
            context.getState().doAlarm(context);
            context.getState().doPhone(context);
            context.getState().doUse(context);
        }
    }
}
