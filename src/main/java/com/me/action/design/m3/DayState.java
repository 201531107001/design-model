package com.me.action.design.m3;

public class DayState implements State{
    
    private static DayState dayState=new DayState();
    
    private DayState(){
        
    }
    
    public static DayState getInstanse() {
        return dayState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour<6 || hour>19) {
            context.changeState(NightState.getInstanse());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("DayState use");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurity("DayState alarm");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("DayState phone");
    }

}
