package com.me.action.design.m3;

public class NightState implements State {

    private static NightState nightState = new NightState();

    private NightState() {

    }

    public static NightState getInstanse() {
        return nightState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 6 && hour <= 19) {
            context.changeState(DayState.getInstanse());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurity("NightState use");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurity("NightState alarm");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("NightState phone");
    }

}
