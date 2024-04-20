package com.example.JobListing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.JobListing.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
