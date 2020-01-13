package com.neo4j.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Neo4jApplication {

	public static void main(String[] args) {
		System.out.println("application started");
		SpringApplication.run(Neo4jApplication.class, args);

	}

}
