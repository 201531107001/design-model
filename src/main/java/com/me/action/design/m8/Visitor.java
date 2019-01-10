package com.me.action.design.m8;

public interface Visitor {
	void view(IncomeBill bill);
	void  view(CustomerBill bill);
}
