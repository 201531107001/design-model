package com.me.action.design.m8;

public class Accountant implements Visitor {
	int count = 0;

	// 查看收入单子
	@Override
	public void visit(IncomeBill bill) {
		count++;
		if (bill.getItem().equals("income")) {
			System.out.println("第" + count + "个单子收入了：" + bill.getAmount());
		}
	}

	// 查看消费的单子
	@Override
	public void visit(CustomerBill bill) {
		count++;
		if (bill.getItem().equals("custom")) {
			System.out.println("第" + count + "个单子消费了：" + bill.getAmount());
		}
	}
}
