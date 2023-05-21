package com.techrecipes.helloworld;

import com.techrecipes.helloworld.util.SequenceGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloworldApplication.class, args);
	}

	@Bean
	public SequenceGenerator sequenceGenerator(){
		return new SequenceGenerator("TR");
	}
}
