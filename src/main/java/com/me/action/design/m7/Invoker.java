package com.me.action.design.m7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Invoker {
    private Command command;
    
    public void execute() {
        command.execute();
    }
}
