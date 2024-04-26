package com.example.springmvc.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvc.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
