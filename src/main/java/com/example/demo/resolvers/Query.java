package com.example.demo.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.example.demo.pojo.Link;
import com.example.demo.repositories.LinkRepository;

public class Query implements GraphQLRootResolver {
    
    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getLinks();
    }
}
