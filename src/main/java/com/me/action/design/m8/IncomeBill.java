package com.me.action.design.m8;

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
		visitor.visit(this);
	}
}
