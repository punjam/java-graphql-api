package com.punjam.graphqlapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(GraphqlConfiguration.class)
public class JavaGraphqlApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaGraphqlApiApplication.class, args);
	}

}
