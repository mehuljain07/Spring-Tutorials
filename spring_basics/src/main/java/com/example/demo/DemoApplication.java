package com.example.demo;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
	

		Alien a = (Alien)factory.getBean("alien");
		a.show();
	}

}
