package com.springtest.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(ExampleApplication.class, args);

		//MyFirstClass myFirstClass = ctx.getBean("myBean",MyFirstClass.class);//when we give name then by default spring will consider the method whic we have created for the Bean
		//System.out.println(myFirstClass.sayHello());

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
	}

}
