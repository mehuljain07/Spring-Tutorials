package com.example.JobListing.repository;

import java.util.List;

import com.example.JobListing.model.Post;

public interface SearchRepository {
	List<Post> findByText(String text);
}
