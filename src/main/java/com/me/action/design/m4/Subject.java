package com.me.action.design.m4;

import java.util.Observable;

public class Subject extends Observable{
    private Integer redius;

    public Integer getRedius() {
        return redius;
    }

    public void setRedius(Integer redius) {
        this.redius = redius;
        setChanged();
        notifyObservers();
    }
    
}
