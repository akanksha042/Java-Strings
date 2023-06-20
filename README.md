# Java String Programs

This repository contains Java programs related to string manipulation. Each program focuses on a specific string operation and provides an example implementation.

## Creating Strings

In Java, there are multiple ways to create a string:

1. **String Literal:** You can create a string using double quotes. For example: `String greeting = "Hello";`

2. **Using the `new` keyword:** You can create a string object using the `new` keyword. For example: `String greeting = new String("Hello");`

3. **Using the `StringBuilder` class:** If you need to manipulate strings frequently, you can use the `StringBuilder` class, which provides mutable string objects.

## String Manipulation

Java provides various methods to manipulate strings:

- **Concatenation:** You can concatenate strings using the `+` operator or the `concat()` method.

- **Substring:** You can extract a part of a string using the `substring()` method.

- **Length:** You can obtain the length of a string using the `length()` method.

- **Splitting:** You can split a string into substrings based on a delimiter using the `split()` method.

- **Replacing:** You can replace characters or substrings within a string using the `replace()` or `replaceAll()` methods.

## String Comparison

To compare strings in Java, you should use the `equals()` method or the `compareTo()` method. Avoid using the `==` operator, as it compares object references rather than the actual content of the strings.

## String Formatting

Java provides the `String.format()` method and the `java.util.Formatter` class for string formatting. These allow you to create formatted strings by replacing placeholders with actual values.

## String Methods

The `java.lang.String` class provides a wide range of useful methods for working with strings. Some commonly used methods include:

- `charAt(int index)`: Returns the character at the specified index.
- `indexOf(String str)`: Returns the index of the first occurrence of the specified string.
- `toUpperCase()` and `toLowerCase()`: Converts the string to uppercase or lowercase, respectively.
- `startsWith(String prefix)` and `endsWith(String suffix)`: Checks if the string starts or ends with the specified prefix or suffix.
- `trim()`: Removes leading and trailing whitespace from the string.

## Table of Contents

1. [String Length](#string-length)
2. [String Concatenation](#string-concatenation)
3. [String charAt Method](#string-charat-method)
4. [Check if a String is Palindrome](#check-if-a-string-is-palindrome)
5. [Shortest Path](#shortest-path)
6. [String Comparison](#string-comparison)
7. [String Substring](#string-substring)
8. [Print Largest String](#print-largest-string)
9. [Why Strings are Immutable](#why-strings-are-immutable)
10. [String Builder](#string-builder)
11. [Convert Letter to Uppercase](#convert-letter-to-uppercase)
12. [String Compression](#string-compression)

## Program Descriptions

### String Length

This program calculates the length of a given string using the `length()` method and prints the result.

### String Concatenation

This program demonstrates string concatenation by combining two strings using the `+` operator and prints the concatenated string.

### String charAt Method

This program shows how to use the `charAt()` method to retrieve a character at a specific index from a string and displays the character.

### Check if a String is Palindrome

This program checks whether a given string is a palindrome or not. It compares the string with its reverse to determine if it reads the same forwards and backwards.

### Shortest Path

This program calculates the shortest path between two given strings by finding the minimum number of operations required to transform one string into another. It uses dynamic programming concepts.

### String Comparison

This program compares two strings using the `equals()` method and displays whether the strings are equal or not.

### String Substring

This program demonstrates the usage of the `substring()` method to extract a substring from a given string based on specified start and end indexes.

### Print Largest String

This program reads a series of strings from the user and determines the largest string among them based on their lengths. It then prints the largest string.

### Why Strings are Immutable

This program explains why strings are immutable in Java and discusses the benefits of immutability in terms of security, efficiency, and caching.

### String Builder

This program showcases the usage of the `StringBuilder` class to manipulate strings efficiently. It demonstrates methods like `append()`, `insert()`, and `delete()`.

### Convert Letter to Uppercase

This program converts all lowercase letters in a given string to uppercase using the `toUpperCase()` method and displays the modified string.

### String Compression

This program compresses a given string by replacing repeated characters with the character followed by the count of its consecutive occurrences. It prints the compressed string.

Feel free to explore the code examples in this repository to learn and understand string manipulation concepts in Java. Happy coding!

## Additional Resources

For more in-depth information about strings in Java, you can refer to the following resources:

- [Oracle Java Documentation on Strings](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)
- [Java String Class - GeeksforGeeks](https://www.geeksforgeeks.org/java-string/)
- [Java String Tutorial - Baeldung](https://www.baeldung.com/java-string)

Feel free to explore the code examples in this repository to gain a better understanding of working with strings in Java. Happy coding!
