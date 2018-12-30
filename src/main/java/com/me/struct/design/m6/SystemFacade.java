package com.me.struct.design.m6;

public class SystemFacade {
    private SubSystem1 system1;
    private SubSystem2 system2;
    private SubSystem3 system3;
    
    public SystemFacade() {
        system1 = new SubSystem1();
        system2 = new SubSystem2();
        system3 = new SubSystem3();
    }
    
    public void method() {
        system1.method1();
        system2.method2();
        system3.method3();
    }
}
