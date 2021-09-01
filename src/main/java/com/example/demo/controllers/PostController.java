package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.PostBodyBean;


@RestController
@RequestMapping("/graphql")
@ResponseStatus(HttpStatus.OK)
public class PostController {
	
	@Autowired
	GraphQLController graphQLController;
	
	@PostMapping
	public Object method(@RequestBody PostBodyBean body, HttpServletRequest request, HttpServletResponse response) {
		String gqlQuery = body.getQuery();
		return graphQLController.executeQuery(gqlQuery);
	}
	
}
