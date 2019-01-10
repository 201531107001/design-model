package com.me.action.design.m8;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {
	private List<Bill> listBill = new ArrayList<Bill>();

	// 添加单子
	public void add(Bill bill) {
		listBill.add(bill);
	}

	// 为每个账单添加访问者
	public void show(Visitor visitor) {
		for (Bill b : listBill) {
			b.accept(visitor);
		}
	}

}
