package com.me.action.design.m9;

import java.util.Objects;

public class GetHandle implements BaseCase {
	@Override
	public void handleRequest(Request request, CaseChain chain) {
		if(Objects.equals(request.getType(),RequestType.GET)){
			System.out.println("get请求，参数:"+request.getParam());
			return;
		}
		// 如果处理不了，就回调
		chain.handleRequest(request,chain);
	}
}
