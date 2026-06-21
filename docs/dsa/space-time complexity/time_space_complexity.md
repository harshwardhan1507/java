# Time and Space Complexity

## Introduction

Till now, you have learned:

- Variables → Store data
    
- Loops → Repeat logic
    
- Arrays → Organize data
    
- Methods → Structure logic
    

Now comes a very critical shift in thinking.

> Not just writing code, but writing efficient code.

---

# Why Do We Need Time Complexity?

Let's say you wrote two solutions:

- Solution A → Runs in 1 second
    
- Solution B → Runs in 10 seconds
    

Both give the correct output.

Which one is better?

Obviously, Solution A.

## Real-Life Context

Imagine:

- 1 student → 10 operations → Fine
    
- 1 lakh students → 10 million operations → Slow
    

Efficiency becomes important when scale increases.

---

# What is Time Complexity?

Time Complexity measures:

> How the number of operations grows with input size.

## Important Clarification

Time Complexity does **not** measure actual time in seconds.

Instead, it measures the growth of operations as input size increases.

---

# What is Space Complexity?

Space Complexity measures:

> How much extra memory your program uses.

---

# Big-O Notation

We represent complexity using **Big-O notation**.

## Common Complexities

|Complexity|Meaning|
|---|---|
|O(1)|Constant|
|O(n)|Linear|
|O(n²)|Quadratic|
|O(log n)|Logarithmic|

---

# 1. O(1) — Constant Time

## Example

```java
int x = 10;
System.out.println(x);
```

## Explanation

No matter the input size:

- Operations remain constant.
    
- Always performs the same amount of work.
    

✅ Time Complexity = O(1)

---

# 2. O(n) — Linear Time

## Example

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

## Explanation

The loop runs `n` times.

Operations grow linearly.

Examples:

- n = 100 → 100 operations
    
- n = 1000 → 1000 operations
    

✅ Time Complexity = O(n)

---

# 3. O(n²) — Quadratic Time

## Example

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

## Explanation

- Outer loop → n
    
- Inner loop → n
    

Total operations:

```text
n × n = n²
```

✅ Time Complexity = O(n²)

## Dry Run

For n = 3:

```text
(0,0) (0,1) (0,2)
(1,0) (1,1) (1,2)
(2,0) (2,1) (2,2)
```

Total operations:

```text
9 = 3²
```

---

# 4. O(log n) — Logarithmic Time

## Example

```java
while (n > 1) {
    n = n / 2;
}
```

## Explanation

Each step halves the value of n.

Example:

```text
16 → 8 → 4 → 2 → 1
```

Number of steps:

```text
log n
```

✅ Time Complexity = O(log n)

---

# How to Calculate Time Complexity

## Rule 1: Ignore Constants

```java
for (int i = 0; i < 2 * n; i++) {
    System.out.println(i);
}
```

```text
O(2n) = O(n)
```

✅ Ignore constant multipliers.

---

## Rule 2: Drop Lower Terms

```text
O(n² + n) = O(n²)
```

✅ Only the highest-order term matters.

---

## Rule 3: Nested Loops Multiply

```java
for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
```

```text
O(n × n) = O(n²)
```

---

## Rule 4: Separate Loops Add

```java
for (int i = 0; i < n; i++)

for (int j = 0; j < n; j++)
```

```text
O(n + n) = O(n)
```

---

## Rule 5: Condition-Based Loops

```java
for (int i = 1; i < n; i *= 2)
```

Each iteration doubles i.

```text
1 → 2 → 4 → 8 → ...
```

✅ Time Complexity = O(log n)

---

# Problem-Based Understanding

## Problem 1

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

Runs n times.

✅ Time Complexity = O(n)

---

## Problem 2

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}
```

```text
n × n = n²
```

✅ Time Complexity = O(n²)

---

## Problem 3

```java
for (int i = 0; i < n / 2; i++) {
    System.out.println(i);
}
```

```text
n / 2
```

Ignore constants.

✅ Time Complexity = O(n)

---

## Problem 4

```java
for (int i = 0; i < n; i += 2)
```

Runs approximately n/2 times.

✅ Time Complexity = O(n)

---

## Problem 5

```java
for (int i = 1; i < n; i *= 2)
```

```text
1 → 2 → 4 → 8 → ...
```

✅ Time Complexity = O(log n)

---

# Best Case vs Worst Case

## Example: Linear Search

```java
for (int i = 0; i < n; i++) {
    if (arr[i] == target) {
        return i;
    }
}
```

|Case|Complexity|
|---|---|
|Best Case|O(1)|
|Worst Case|O(n)|

---

# Space Complexity

## What is Space Complexity?

Space Complexity measures:

> Extra memory used by a program.

---

## Example 1

```java
int a = 10;
```

Uses constant memory.

✅ Space Complexity = O(1)

---

## Example 2

```java
int[] arr = new int[n];
```

Memory grows with n.

✅ Space Complexity = O(n)

---

## Example 3

```java
int[][] matrix = new int[n][n];
```

```text
n × n
```

✅ Space Complexity = O(n²)

---

# Auxiliary Space

Auxiliary Space means:

> Extra space used apart from the input.

## Example

```java
int sum = 0;
```

Uses constant extra memory.

✅ Auxiliary Space = O(1)

---

# Combined Example

```java
int[] arr = new int[n];
```

Input space:

```text
O(n)
```

Extra space:

```text
O(1)
```

---

# Time vs Space Tradeoff

Sometimes:

- Faster code uses more memory.
    
- Less memory uses more time.
    

Examples:

|Approach|Time|Memory|
|---|---|---|
|Brute Force|Slow|Less|
|Optimized|Fast|More|

---

# Common Mistakes

## Mistake 1

❌ Thinking Time Complexity means seconds.

Wrong.

Actual runtime depends on:

- Machine
    
- Compiler
    
- Operating System
    

Time Complexity measures growth of operations.

---

## Mistake 2

❌ Not removing constants.

```text
O(2n)
```

Wrong.

```text
O(n)
```

Correct.

---

## Mistake 3

❌ Confusing nested loops with sequential loops.

Nested loops multiply.

Sequential loops add.

---

# Interview Importance

Time and Space Complexity is:

- Asked in almost every coding interview.
    
- Required for optimization.
    
- Used to compare multiple solutions.
    

---

# Practice Questions

## Basic Level

### 1

```java
for (int i = 0; i < n; i++)
```

### 2

```java
for (int i = 0; i < n; i++)
    for (int j = 0; j < i; j++)
```

### 3

```java
for (int i = n; i > 0; i /= 2)
```

### 4

```java
for (int i = 0; i < n; i++)
    for (int j = 0; j < m; j++)
```

### 5

```java
int[] arr = new int[n];
```

---

## Intermediate Level

### 6

```java
for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j += 2)
```

### 7

```java
for (int i = 1; i < n; i *= 3)
```

### 8

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

for (int j = 0; j < n; j++) {
    System.out.println(j);
}
```

### 9

```java
for (int i = 0; i < n; i++)
    for (int j = i; j < n; j++)
```

### 10

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
        for (int k = 0; k < j; k++) {
            System.out.println(i + j + k);
        }
    }
}
```

---

## Advanced Thinking Level

### 11

```java
int i = 0;

while (i < n) {
    i += 2;
}
```

### 12

```java
int i = 1;

while (i < n) {
    i *= 2;
}
```

### 13

```java
for (int i = 0; i < n; i++) {
    i++;
}
```

### 14

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < Math.sqrt(n); j++) {
        System.out.println(i + j);
    }
}
```

### 15

```java
for (int i = 0; i < n; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}
```

---

## Space Complexity Practice

### 16

```java
int x = 10;
```

### 17

```java
int[] arr = new int[n];
```

### 18

```java
int[][] matrix = new int[n][n];
```

### 19

```java
int[] a = new int[n];
int[] b = new int[n];
```

### 20

```java
int[][] grid = new int[n][m];
```

---

# Final Takeaway

If loops and arrays taught you how to solve problems:

- Time Complexity teaches you how efficiently you solve them.
    
- Space Complexity teaches you how smartly you use memory.
    

## Most Important Insight

Writing a working solution is Step 1.

Writing an efficient solution is Step 2.

---

# Learning Progression

In a structured learning journey:

- Beginners focus on correctness.
    
- Intermediate learners focus on logic.
    
- Advanced learners focus on optimization.
    

Today, you are stepping into the optimization mindset.

---

