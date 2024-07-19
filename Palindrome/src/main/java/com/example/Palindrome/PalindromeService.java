package com.example.Palindrome;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }
}
