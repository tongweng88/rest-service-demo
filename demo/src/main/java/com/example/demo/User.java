package com.example.demo;

public class User {
	private final long id;
	private final String name;
	
	public User(long l, String name) {
		this.id = l;
		this.name = name;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
}
