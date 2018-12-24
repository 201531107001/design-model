package com.me.create.design.m5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Birth {
    private Integer year;
    private Integer mouth;
    private Integer day;
    
    @Override
    public String toString() {
        return year+"年"+mouth+"月"+day+"日";
    }
}
