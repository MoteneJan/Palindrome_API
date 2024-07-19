package com.example.Palindrome;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PalindromeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testPalindromeService() {
		PalindromeService palindromeService = new PalindromeService();

		assertEquals("racecar", palindromeService.reverseString("racecar"));
		assertEquals("level", palindromeService.reverseString("level"));
		assertEquals("olleh", palindromeService.reverseString("hello"));

		assertTrue(palindromeService.isPalindrome("racecar"));
		assertTrue(palindromeService.isPalindrome("level"));
		assertFalse(palindromeService.isPalindrome("hello"));
	}
}

