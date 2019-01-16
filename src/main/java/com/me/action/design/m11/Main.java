package com.me.action.design.m11;

public class Main {
	public static void main(String[] args) {
		Context c = new Context();
		AbstractExpression  te  =  new TerminalExpression("hello");
		AbstractExpression  nte  =  new NonterminalExpression(te,2);
		nte.Interpret(c);
	}
}
