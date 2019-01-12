package com.me.action.design.m9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Request {
	private RequestType type;
	private String param;
}
