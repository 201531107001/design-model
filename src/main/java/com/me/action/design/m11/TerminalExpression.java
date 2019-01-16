package com.me.action.design.m11;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TerminalExpression implements AbstractExpression {
	String statement;
	@Override
	public void Interpret(Context c) {
		System.out.println(statement);
	}
}
