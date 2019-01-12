package com.me.action.design.m9;

import java.util.Objects;

public class DefaultHandle implements BaseCase {
	@Override
	public void handleRequest(Request request, CaseChain chain) {
		System.out.println("default请求，参数:"+request.getParam());
		return;
	}
}
