package com.example.Palindrome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PalindromeController {

    @Autowired
    private PalindromeService palindromeService;

    @GetMapping("api/v1/checkPalindrome")
    public Map<String, Object> checkPalindrome(@RequestParam String input) {
        String reversedString = palindromeService.reverseString(input);
        boolean isPalindrome = palindromeService.isPalindrome(input);

        Map<String, Object> response = new HashMap<>();
        response.put("reversedString", reversedString);
        response.put("isPalindrome", isPalindrome);

        return response;
    }

    @PostMapping("api/v1/checkPalindrome")
    public Map<String, Object> checkPalindromePost(@RequestBody Map<String, String> request) {
        String input = request.get("input");
        String reversedString = palindromeService.reverseString(input);
        boolean isPalindrome = palindromeService.isPalindrome(input);

        Map<String, Object> response = new HashMap<>();
        response.put("reversedString", reversedString);
        response.put("isPalindrome", isPalindrome);

        return response;
    }

    @PutMapping("api/v1/checkPalindrome")
    public Map<String, Object> checkPalindromePut(@RequestBody Map<String, String> request) {
        String input = request.get("input");
        String reversedString = palindromeService.reverseString(input);
        boolean isPalindrome = palindromeService.isPalindrome(input);

        Map<String, Object> response = new HashMap<>();
        response.put("reversedString", reversedString);
        response.put("isPalindrome", isPalindrome);

        return response;
    }

    @DeleteMapping("api/v1/checkPalindrome")
    public Map<String, Object> deletePalindrome(@RequestParam String input) {
        String reversedString = palindromeService.reverseString(input);
        boolean isPalindrome = palindromeService.isPalindrome(input);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Deleted palindrome check for input: " + input);
        response.put("reversedString", reversedString);
        response.put("isPalindrome", isPalindrome);

        return response;
    }
}
