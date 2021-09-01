package com.example.demo.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.example.demo.pojo.Link;
import com.example.demo.pojo.Post;
import com.example.demo.pojo.User;
import com.example.demo.repositories.LinkRepository;
import com.example.demo.repositories.UserRepository;

public class Query implements GraphQLRootResolver {
    
    private final LinkRepository linkRepository;
    private final UserRepository userRepository;

    public Query(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getLinks();
    }
    
    public List<User> users() {
    	return userRepository.getUsers();
    }
    
}
