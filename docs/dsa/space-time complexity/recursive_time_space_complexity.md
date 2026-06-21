# Recursive Time and Space Complexity

## Introduction

In the previous lecture, we learned how recursion works.

We covered:

- Base Case
    
- Recursive Call
    
- Self Work
    
- Call Stack
    
- Backtracking
    

Now a very important question arises:

> How expensive is recursion?

To answer this question, we study:

1. Time Complexity
    
2. Space Complexity
    

---

# Why Does Recursion Have Two Complexities?

Whenever a recursive function runs, two things happen:

## 1. Work is Performed

The function may perform calculations.

Example:

```java
return n * factorial(n - 1);
```

This contributes to **Time Complexity**.

---

## 2. Function Calls are Stored

Every recursive call creates a new stack frame.

This contributes to **Space Complexity**.

---

# Understanding Time Complexity

Time Complexity tells us:

> How much work is performed as the input size grows.

For recursive functions, we generally calculate:

1. Number of recursive calls
    
2. Work done inside each call
    

---

# Example 1: Print Numbers from N to 1

## Code

```java
public static void printNumbers(int n) {

    if (n == 0) {
        return;
    }

    System.out.println(n);

    printNumbers(n - 1);
}
```

---

## Dry Run

For:

```java
printNumbers(5);
```

Calls generated:

```text
printNumbers(5)
printNumbers(4)
printNumbers(3)
printNumbers(2)
printNumbers(1)
printNumbers(0)
```

Total calls:

```text
6
```

For input size `n`:

```text
n + 1 calls
```

---

## Work Done in Each Call

Inside each call:

```java
System.out.println(n);
```

Printing is considered constant work.

```text
O(1)
```

---

## Total Time Complexity

```text
Number of Calls × Work Per Call

= O(n) × O(1)

= O(n)
```

✅ Time Complexity = **O(n)**

---

# Example 2: Factorial

## Code

```java
public static int factorial(int n) {

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

---

## Recursive Calls

For:

```java
factorial(5);
```

Calls generated:

```text
factorial(5)
factorial(4)
factorial(3)
factorial(2)
factorial(1)
factorial(0)
```

Total calls:

```text
6
```

In general:

```text
n + 1 calls
```

---

## Work Performed

Inside each call:

```java
n * smallerAnswer
```

One multiplication operation occurs.

```text
O(1)
```

---

## Time Complexity

```text
O(n)
```

✅ Time Complexity = **O(n)**

---

# Example 3: Power of Two

## Code

```java
public static int powerOfTwo(int n) {

    if (n == 0) {
        return 1;
    }

    return 2 * powerOfTwo(n - 1);
}
```

---

## Number of Calls

```text
n + 1
```

---

## Work Per Call

One multiplication:

```text
O(1)
```

---

## Time Complexity

```text
O(n)
```

✅ Time Complexity = **O(n)**

---

# Understanding Space Complexity

A very common mistake is:

> "Factorial only uses one variable, so its space complexity must be O(1)."

This is incorrect.

In recursion, we must also count the memory used by the recursion stack.

---

# What Creates Space Complexity?

Every recursive call creates a new stack frame.

Example:

```java
factorial(5);
```

Creates:

```text
factorial(5)
factorial(4)
factorial(3)
factorial(2)
factorial(1)
factorial(0)
```

Before the base case is reached, all of these calls remain in memory.

---

# Space Complexity of Factorial

Maximum stack depth:

```text
n + 1
```

Therefore:

```text
Space Complexity = O(n)
```

✅ Space Complexity = **O(n)**

---

# Shortcut for Single Recursive Calls

Whenever you see:

```java
solve(n - 1);
```

or

```java
solve(n / 2);
```

Ask two questions:

### Question 1

How many recursive calls are generated?

### Question 2

What is the maximum recursion depth?

The answers usually give you the complexity.

---

# Quick Examples

## Factorial

```java
factorial(n - 1);
```

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(n)
```

---

## Power of Two

```java
power(n - 1);
```

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(n)
```

---

## Recursive Binary Search

```java
search(n / 2);
```

Time Complexity:

```text
O(log n)
```

Space Complexity:

```text
O(log n)
```

Why?

Because each call cuts the problem size in half.

Recursion depth becomes:

```text
log n
```

---

# Golden Rule

For beginner recursion problems:

## Time Complexity

```text
(Number of Recursive Calls)
×
(Work Done in Each Call)
```

---

## Space Complexity

```text
Maximum Depth of Recursion Stack
```

If you can answer these two questions, you can solve the complexity of most beginner recursion problems.

---

# Worked Examples

## Example 1

```java
public static void solve(int n) {

    if (n == 0) {
        return;
    }

    solve(n - 1);
}
```

Calls:

```text
n
```

Work per call:

```text
O(1)
```

Time:

```text
O(n)
```

Space:

```text
O(n)
```

---

## Example 2

```java
public static void solve(int n) {

    if (n <= 1) {
        return;
    }

    solve(n / 2);
}
```

Problem size:

```text
n → n/2 → n/4 → n/8 ...
```

Number of calls:

```text
log n
```

Time:

```text
O(log n)
```

Space:

```text
O(log n)
```

---

# Common Mistakes

## Mistake 1

Ignoring recursion stack memory.

```java
factorial(n);
```

Uses:

```text
O(n)
```

space, not O(1).

---

## Mistake 2

Counting only variables.

Recursion complexity depends heavily on stack frames.

---

## Mistake 3

Assuming recursive code is always slower.

Some recursive algorithms are extremely efficient.

Example:

```java
Binary Search
Merge Sort
Quick Sort
```

Efficiency depends on the algorithm, not recursion itself.

---

# Interview Checklist

Whenever you see a recursive function, ask:

### 1. How many recursive calls are made?

### 2. How much work is done inside one call?

### 3. What is the maximum recursion depth?

Using these three questions, you can derive:

- Time Complexity
    
- Space Complexity
    

for most beginner and intermediate recursion problems.

---

# Summary

Recursion introduces two separate costs:

## Time Complexity

Measures total work performed.

Formula:

```text
(Number of Recursive Calls)
×
(Work Per Call)
```

---

## Space Complexity

Measures memory used by the recursion stack.

Formula:

```text
Maximum Recursion Depth
```

---

# Final Takeaway

Whenever you solve a recursive problem:

1. Count the recursive calls.
    
2. Measure the work inside each call.
    
3. Measure the maximum recursion depth.
    

From these answers:

- Time Complexity can be calculated.
    
- Space Complexity can be calculated.
    

This forms the foundation for:

- Recursion Trees
    
- Divide and Conquer
    
- Recurrence Relations
    
- Merge Sort
    
- Quick Sort
    
- Dynamic Programming