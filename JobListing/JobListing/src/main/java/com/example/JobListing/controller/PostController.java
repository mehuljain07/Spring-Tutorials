package com.example.JobListing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.JobListing.model.Post;
import com.example.JobListing.repository.PostRepository;
import com.example.JobListing.repository.SearchRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("http://localhost:3000")
public class PostController {
	
	@Autowired
	PostRepository repo;
	@Autowired
	SearchRepository srepo;
	
	@GetMapping("posts")
	public List<Post> getAllPosts(){
		return repo.findAll();
	}
	
	@PostMapping("post")
	public Post addPost(@RequestBody Post post) {
		return repo.save(post);
		
	}
	
	@GetMapping("posts/{text}")
	public List<Post> search(@PathVariable("text") String text){
		return srepo.findByText(text);
	}
	
}
