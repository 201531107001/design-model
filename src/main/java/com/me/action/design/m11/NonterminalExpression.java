package com.me.action.design.m11;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NonterminalExpression implements AbstractExpression {
	AbstractExpression expression;
	int times;

	@Override
	public void Interpret(Context c) {
		for (int i = 0; i < times ; i++) {
			expression.Interpret(c);
		}
	}
}
