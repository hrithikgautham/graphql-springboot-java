package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.repositories.PostRepository;

public class User {
	final private int id;
	final private String name;
//	final private List<Post> posts = new ArrayList<>();
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Post> posts() {
		PostRepository postRepository = new PostRepository();
    	return postRepository.getPosts().stream().filter(post -> post.getId() == id).collect(Collectors.toList());
    }
}
