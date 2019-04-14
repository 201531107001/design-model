package com.me.action.design.m8;

public interface Visitor {
	void visit(IncomeBill bill);
	void  visit(CustomerBill bill);
}
