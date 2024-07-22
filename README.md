# Palindrome_API

This project is a simple Spring Boot application that provides an API endpoint to check if a string is a palindrome and to return the reversed string.

## Overview

## Requirements
Prerequisites
- Java 8 or higher
- Maven

## Setup

## Git clone the repository
git clone https://github.com/MoteneJan/Palindrome_API.git
cd Palindrome-API

## Endpoints- Used POSTMAN

### GET /api/v1/Pallandrome_API

**Parameters:**

- `input` (query string parameter): The input string to be processed.
- e.g,. `input` - "racecar"

**Response:**

```json
{
  "ReversedString": "your reversed string",
  "IsPalindrome": true/false
}
