package com.me.action.design.m8;

public class Boss implements Visitor {
	private double totalConsumer;
	private double totalIncome;

	public void getTotalConsumer() {
		System.out.println("老板一共消费了" + totalConsumer);
	}

	public void getTotalIncome() {
		System.out.println("老板一共收入了" + totalIncome);
	}

	@Override
	public void visit(IncomeBill bill) {
		totalIncome = totalIncome + bill.getAmount();
	}

	@Override
	public void visit(CustomerBill bill) {
		totalConsumer = totalConsumer + bill.getAmount();
	}
}
