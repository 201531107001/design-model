package com.me.action.design.m8;

import lombok.Getter;

/**
 * 消费账单
 */
@Getter
public class CustomerBill extends Bill{

	public CustomerBill(String item, double amount) {
		this.item = item;
		this.amount = amount;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
