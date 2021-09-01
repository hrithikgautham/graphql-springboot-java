package com.example.demo.pojo;

public class Post {
	private int id;
	private String title;
	private String description;
	
	public Post(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	
	
}
