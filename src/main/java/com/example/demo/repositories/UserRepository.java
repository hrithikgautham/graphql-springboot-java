package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.pojo.User;


//dummy database
public class UserRepository {
	private List<User> users = new ArrayList<>();
	
	public UserRepository() {
		User user = new User(1, "hrithik");
		users.add(user);
		user = new User(2, "Gautham");
		users.add(user);
		user = new User(3, "Anush");
		users.add(user);
		user = new User(4, "Jitendra");
		users.add(user);
		user = new User(5, "Manu");
		users.add(user);
		user = new User(6, "Lita");
		users.add(user);
		user = new User(7, "Ronak");
		users.add(user);
		user = new User(8, "Jamppi");
		users.add(user);
		user = new User(9, "Scream");
		users.add(user);
		user = new User(10, "Olof");
		users.add(user);
		user = new User(11, "TG");
		users.add(user);
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
}
