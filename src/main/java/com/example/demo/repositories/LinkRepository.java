package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.pojo.Link;

public class LinkRepository {
    
    private final List<Link> links;

    public LinkRepository() {
        links = new ArrayList<>();
        //add some links to start off with
        links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
        links.add(new Link("http://graphql.org/learn/", "The official docks"));
    }

    public List<Link> getLinks() {
        return links;
    }
    
    public void saveLink(Link link) {
        links.add(link);
    }
}
