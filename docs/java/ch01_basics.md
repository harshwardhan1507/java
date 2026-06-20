# ch01_basics

# ☕ Chapter 01 - Java Basics

## Overview

This chapter introduces the fundamental building blocks of Java programming.

Before learning Object-Oriented Programming, Data Structures, Design Patterns, or Frameworks, it is important to understand how Java programs are structured, how data is stored, and how users interact with applications.

### Learning Objectives

By the end of this chapter, you should be able to:

* Understand the structure of a Java program
* Declare and use variables
* Work with primitive data types
* Accept user input
* Perform arithmetic operations
* Use the Math class
* Format output using `printf`

---

# Topics Covered

## 1. Hello World

**File:** `HelloWorld.java`

### Concepts

* Java program structure
* `main()` method
* `System.out.println()`
* `System.out.print()`

### Example

```java
System.out.println("Hello World");
System.out.print("My name is Harsh");
```

---

## 2. Variables & Data Types

**File:** `VariablesAndDataTypes.java`

Variables are containers used to store data.

### Primitive Data Types

| Type    | Example | Description             |
| ------- | ------- | ----------------------- |
| int     | 10      | Whole numbers           |
| double  | 3.14    | Decimal numbers         |
| float   | 3.14f   | Smaller decimal numbers |
| long    | 100000L | Large integers          |
| char    | 'A'     | Single character        |
| boolean | true    | True or False           |

### Reference Type

| Type   | Example       |
| ------ | ------------- |
| String | "Hello World" |

### Constants

Use `final` when a value should never change.

```java
final double PI = 3.14159;
```

---

## 3. User Input

**File:** `UserInput.java`

Java uses the `Scanner` class to accept user input.

### Import

```java
import java.util.Scanner;
```

### Common Scanner Methods

| Method        | Purpose       |
| ------------- | ------------- |
| nextInt()     | Integer input |
| nextDouble()  | Decimal input |
| nextBoolean() | Boolean input |
| next()        | Single word   |
| nextLine()    | Entire line   |

### Important Note

When switching from:

```java
nextInt()
```

to:

```java
nextLine()
```

always clear the input buffer:

```java
scanner.nextLine();
```

This is one of the most common beginner mistakes.

---

## 4. Arithmetic Operations

**File:** `ArithmeticOperations.java`

Java supports standard arithmetic operators.

| Operator | Meaning        |
| -------- | -------------- |
| +        | Addition       |
| -        | Subtraction    |
| *        | Multiplication |
| /        | Division       |
| %        | Modulus        |
| ++       | Increment      |
| --       | Decrement      |

### Example

```java
int sum = a + b;
int remainder = a % b;
```

### Common Mistake

Avoid division by zero:

```java
if (b != 0) {
    System.out.println(a / b);
}
```

---

## 5. Math Class

**File:** `MathClassDemo.java`

Java provides a built-in `Math` class for mathematical operations.

### Common Methods

```java
Math.max()
Math.min()
Math.abs()
Math.sqrt()
Math.pow()
Math.round()
Math.floor()
Math.ceil()
Math.random()
```

### Example

```java
double result = Math.pow(2, 3);
```

**Output**

```text
8.0
```

---

## 6. Formatted Output

**File:** `PrintfFormatting.java`

The `printf()` method allows formatted output.

### Common Format Specifiers

| Specifier | Meaning            |
| --------- | ------------------ |
| %s        | String             |
| %d        | Integer            |
| %f        | Decimal            |
| %.2f      | Two decimal places |
| %c        | Character          |
| %b        | Boolean            |
| %n        | New Line           |

### Example

```java
System.out.printf("CGPA: %.2f", cgpa);
```

**Output**

```text
CGPA: 8.95
```

---

# Key Takeaways

✅ Every Java program starts with the `main()` method.

✅ Variables store data that can be used and modified throughout a program.

✅ Primitive and reference types serve different purposes.

✅ The `Scanner` class allows interaction with users.

✅ Arithmetic operators perform calculations.

✅ The `Math` class provides common mathematical functions.

✅ `printf()` helps create clean and professional output.

---

# Common Beginner Mistakes

### 1. Forgetting the `f` suffix for float values

```java
float num = 3.14f;
```

### 2. Using `=` instead of `==`

Incorrect:

```java
if(age = 18)
```

Correct:

```java
if(age == 18)
```

### 3. Forgetting to clear the Scanner buffer

```java
scanner.nextLine();
```

### 4. Dividing by Zero

```java
int result = a / 0;
```

This will throw an `ArithmeticException`.

### 5. Forgetting Semicolons

Incorrect:

```java
int age = 20
```

Correct:

```java
int age = 20;
```

---

# Mini Project

After completing this chapter, try:

`CompoundInterestCalculator.java`
[code](./projects/ch01_basics/CompoundInterestCalculator.java)

This project combines:

* Variables
* User Input
* Arithmetic Operations
* `Math.pow()`
* Formatted Output

and serves as your first practical Java application.

---

# Next Chapter

➡ **[Chapter 02 - Control Flow](ch02_control_flow.md)**

Topics:

* If Statements
* Nested If Statements
* Ternary Operator
* Switch Expressions
* Logical Operators

