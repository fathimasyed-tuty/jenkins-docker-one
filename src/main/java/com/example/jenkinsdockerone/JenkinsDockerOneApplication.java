package com.example.jenkinsdockerone;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDockerOneApplication {

	public static void getMessage(String name) {

		System.out.println("Hi " + name);
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.next("Enter name, ");
			getMessage(n);
		}
		SpringApplication.run(JenkinsDockerOneApplication.class, args);
	}

}
