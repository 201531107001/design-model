package com.me.action.design.m7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Command {
    protected Receiver receiver;
    
    public abstract void execute();
}
