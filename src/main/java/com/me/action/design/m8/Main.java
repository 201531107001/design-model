package com.me.action.design.m8;

public class Main {
	public static void main(String[] args) {
		AccountBook accountBook = new AccountBook();
		accountBook.add(new IncomeBill("income",5));
		accountBook.add(new CustomerBill("custom",10));
		accountBook.add(new IncomeBill("income",20));
		accountBook.add(new CustomerBill("custom",15));

		Boss boss = new Boss();
		accountBook.show(boss);
		boss.getTotalConsumer();

		System.out.println("=====================================================");
		Accountant accountant = new Accountant();
		accountBook.show(accountant);

	}
}
