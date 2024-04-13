package com.example.SpringJDBCDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.SpringJDBCDemo.model.Alien;
import com.example.SpringJDBCDemo.repo.AlienRepo;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext)SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Alien a1 = context.getBean(Alien.class);
		a1.setId(104);
		a1.setName("Akash");
		a1.setTech("Python");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(a1);

		System.out.println(repo.findAll());
	}

}
