package com.me.action.design.m3;

public class Context {
    
    private State state = null;
    
    public void setClock(int hour) {
        state.doClock(this, hour);
    }
    
    public void changeState(State state) {
        this.state = state;
    }
    
    public void callSecurity(String str) {
        System.out.println(str);
    }
    
    public void recordLog(String msg) {
        System.out.println(msg);
    }
    
    public State getState() {
        return state;
    }
}
