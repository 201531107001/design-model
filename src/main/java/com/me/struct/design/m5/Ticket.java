package com.me.struct.design.m5;
/**
 * 抽象享元角色类
 * @author 清明
 *
 */
public abstract class Ticket {
    protected String start;
    protected String end;
    
    public Ticket(String start,String end) {
        this.end = end;
        this.start = start;
    }
    //一个示意性方法，参数type是外蕴状态
    public abstract int getPrice(TicketConsts type);
}
