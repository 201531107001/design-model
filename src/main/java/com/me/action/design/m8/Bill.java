package com.me.action.design.m8;

import lombok.Getter;

/**
 * 账单
 */
@Getter
public abstract class Bill {
	protected String item;
	protected double amount;

	public abstract void accept(Visitor visitor);
}
