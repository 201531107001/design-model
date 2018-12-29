package com.me.struct.design.m5;

public enum TicketConsts {
    RUAN_WO("软卧"),YING_WO("硬卧"),YING_ZUO("硬座"),ZHAN_PIAO("站票");
    
    private String type;
    
    private TicketConsts(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
