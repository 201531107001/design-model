package com.me.action.design.m5;

import lombok.Data;

@Data
public class Originator {
    private String value;
    
    public Memento createMemento() {
        return new Memento(value);
    }
    
    public void restoreMenento(Memento memento) {
        this.setValue(memento.getValue());
    }
}
