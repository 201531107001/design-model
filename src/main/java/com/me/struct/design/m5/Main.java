package com.me.struct.design.m5;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = TicketFactory.geTicket("成都", "太原");
        System.out.println(ticket1.getPrice(TicketConsts.YING_WO));
        
        Ticket ticket2 = TicketFactory.geTicket("成都", "太原");
        System.out.println(ticket2.getPrice(TicketConsts.ZHAN_PIAO));
        
        //输出:com.me.struct.design.m5.ConcreteTicket@15db9742
        //com.me.struct.design.m5.ConcreteTicket@15db9742
        //是同一个对象
        System.out.println(ticket1+"\n"+ticket2);
    }
}
