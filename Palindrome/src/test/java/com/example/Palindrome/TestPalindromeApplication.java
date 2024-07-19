package com.example.Palindrome;

import org.springframework.boot.SpringApplication;

public class TestPalindromeApplication {

	public static void main(String[] args) {
		SpringApplication.from(PalindromeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
