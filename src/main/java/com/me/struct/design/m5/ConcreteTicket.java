package com.me.struct.design.m5;

import java.util.HashMap;
import java.util.Map;

public class ConcreteTicket extends Ticket{
    
    private static final Map<String, Integer> prices = new HashMap<>();
    
    static {
        prices.put("成都-太原", 100);
        prices.put("北京-太原", 50);
        prices.put("太原-大同", 30);
    }

    public ConcreteTicket(String start, String end) {
        super(start, end);
    }

    /**
     * 这里应该根据具体的业务去获取票价
     */
    @Override
    public int getPrice(TicketConsts type) {
        int price = 0;
        
        // 这里为了简单，软卧、硬卧为硬座的倍数
        if(TicketConsts.RUAN_WO.equals(type)) {
            price = prices.get(start+"-"+end)*4;
        }else if(TicketConsts.YING_WO.equals(type)) {
            price = prices.get(start+"-"+end)*2;
        }else if(TicketConsts.ZHAN_PIAO.equals(type)) {
            price = prices.get(start+"-"+end);
        }else if(TicketConsts.YING_ZUO.equals(type)) {
            price = prices.get(start+"-"+end);
        }
        
        return price;
    }

}
