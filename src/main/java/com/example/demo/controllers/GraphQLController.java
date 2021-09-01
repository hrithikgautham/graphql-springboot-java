package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.SchemaParser;
import com.example.demo.repositories.LinkRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.resolvers.Query;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

@Component
public class GraphQLController extends SimpleGraphQLServlet {
	
	
	public GraphQLController() {
        super(buildSchema());
    }

	 private static GraphQLSchema buildSchema() {
        LinkRepository linkRepository = new LinkRepository();
        UserRepository userRepository = new UserRepository();
//        PostRepository postRepository = new PostRepository();
        
//        GraphQLResolver<?>[] resolvers;
//        resolvers = new GraphQLResolver[1];
//        resolvers[0] = new Query(linkRepository, userRepository);
        
        return SchemaParser
        		.newParser()
                .file("schema.graphql")
                .resolvers(new Query(linkRepository, userRepository))
                .build()
                .makeExecutableSchema();
    }
}

