package com.example.restservice;

public class Greeting {

	private final long id;
	private final String content;
	private final String var1;

	public Greeting(long id, String content, String var1) {
		this.id = id;
		this.content = content;
		this.var1 = var1;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getVar1() {
		return var1;
	}

}
