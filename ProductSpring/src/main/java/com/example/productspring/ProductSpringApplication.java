package com.example.productspring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ProductSpringApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);
		ProductService service = context.getBean(ProductService.class);
		 List<Product> products = service.getAllProducts();
	        for(Product p: products) {
	        	System.out.println(p);
	        }
	}

}
