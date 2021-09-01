package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.pojo.Post;

public class PostRepository {
	private List<Post> posts = new ArrayList<>();
	
	public PostRepository() {
		Post post = new Post(1, "title1", "desc1");
		posts.add(post);
		post = new Post(1, "title1", "desc1");
		posts.add(post);
		post = new Post(1, "title2", "desc2");
		posts.add(post);
		post = new Post(1, "title3", "desc3");
		posts.add(post);
		post = new Post(2, "title1", "desc1");
		posts.add(post);
		post = new Post(2, "title2", "desc2");
		posts.add(post);
		post = new Post(3, "title1", "desc1");
		posts.add(post);
		post = new Post(4, "title1", "desc1");
		posts.add(post);
		
		post = new Post(4, "title2", "desc2");
		posts.add(post);
		post = new Post(6, "title1", "desc1");
		posts.add(post);
		post = new Post(6, "title2", "desc2");
		posts.add(post);
		post = new Post(8, "title1", "desc1");
		posts.add(post);
		post = new Post(8, "title2", "desc2");
		posts.add(post);
		post = new Post(8, "title3", "desc3");
		posts.add(post);
		post = new Post(8, "title4", "desc4");
		posts.add(post);
	}
	
	public List<Post> getPosts() {
		return posts;
	}
}
