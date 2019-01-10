package com.me.action.design.m8;

import lombok.Getter;

/**
 * 收入账单
 */
public class IncomeBill extends Bill {

	public IncomeBill(String item, double amount) {
		this.item = item;
		this.amount = amount;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.view(this);
	}
}
