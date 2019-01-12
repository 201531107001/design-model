package com.me.action.design.m9;

import java.util.ArrayList;
import java.util.List;

public class CaseChain implements BaseCase {
	private List<BaseCase> list = new ArrayList<>();
	private int index = 0;
	@Override
	public void handleRequest(Request request,CaseChain chain) {
		if(index == list.size()){
			return;
		}

		BaseCase baseCase = list.get(index);
		index++;
		baseCase.handleRequest(request,chain);
	}

	public void addCase(BaseCase baseCase){
		list.add(baseCase);
	}
}
