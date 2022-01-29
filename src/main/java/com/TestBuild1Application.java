package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestBuild1Application {

	public static void main(String[] args) {
		SpringApplication.run(TestBuild1Application.class, args);
		System.out.println("hello World From Spring BootApp");
	}

}
