package com.example.git.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
public void hello(){
	System.out.println("Hello from here");
}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
