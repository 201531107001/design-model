package com.me.action.design.m9;

public class Main {
	public static void main(String[] args) {
		CaseChain chain = new CaseChain();
		chain.addCase(new PostHandle());
		chain.addCase(new GetHandle());
		chain.addCase(new DefaultHandle());

		Request request = new Request(RequestType.GET,"a=1");
		chain.handleRequest(request,chain);

	}
}
