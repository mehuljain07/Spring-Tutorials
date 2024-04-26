package com.example.springmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvc.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findUserByUsername(String username);
}
