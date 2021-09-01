package com.example.demo.controllers;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.SchemaParser;
import com.example.demo.repositories.LinkRepository;
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
        return SchemaParser
        		.newParser()
                .file("schema.graphql")
                .resolvers(new Query(linkRepository))
                .build()
                .makeExecutableSchema();
    }
}

