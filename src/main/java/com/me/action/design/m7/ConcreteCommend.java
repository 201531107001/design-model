package com.me.action.design.m7;

public class ConcreteCommend extends Command{
    public ConcreteCommend(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.execute();
    }
}
