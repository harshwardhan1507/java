
# Java Loops

## Introduction

In programming, we often need to repeat a task multiple times.

For example, you may want to:

- Print progress for 7 days
    
- Check all completed modules
    
- Repeat a menu until the user exits
    
- Process multiple test cases
    

If you write the same statement repeatedly, the code becomes long and difficult to maintain.

This is where loops help.

> Loops allow us to execute a block of code repeatedly.

---

# What is a Loop in Java?

A loop is a control structure that repeats a block of code as long as a condition is satisfied.

Java provides three primary loops:

1. `for` loop
    
2. `while` loop
    
3. `do-while` loop
    

Each loop is useful in different situations.

---

# Why Do We Need Loops?

Loops help in:

- Reducing repetition
    
- Writing shorter code
    
- Solving pattern problems
    
- Processing arrays and strings
    
- Implementing DSA logic
    
- Handling repeated input/output
    

Without loops:

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

This approach is not scalable.

Using a loop is much better.

---

# Java for Loop

The `for` loop is used when the number of iterations is known in advance.

## Syntax

```java
for (initialization; condition; update) {
    // code
}
```

## Components of a for Loop

### 1. Initialization

Runs only once at the beginning.

```java
int i = 1;
```

### 2. Condition

Checked before every iteration.

- If true → loop executes
    
- If false → loop stops
    

### 3. Update

Updates the loop variable after each iteration.

```java
i++;
```

---

## Example 1: Print Numbers from 1 to 5

```java
public class Main {
    public static void main(String[] args) {

        for (int day = 1; day <= 5; day++) {
            System.out.println(day);
        }
    }
}
```

### Output

```text
1
2
3
4
5
```

### Dry Run

|Iteration|day|Condition|Output|
|---|---|---|---|
|1|1|True|1|
|2|2|True|2|
|3|3|True|3|
|4|4|True|4|
|5|5|True|5|
|6|6|False|Stop|

---

## Example 2: Print Even Numbers from 2 to 10

```java
for (int value = 2; value <= 10; value += 2) {
    System.out.println(value);
}
```

### Output

```text
2
4
6
8
10
```

---

## Example 3: Print a Message 3 Times

```java
for (int attempt = 1; attempt <= 3; attempt++) {
    System.out.println("Keep practicing");
}
```

---

## When to Use for Loop?

Use a `for` loop when:

- Number of iterations is known
    
- Working with indices
    
- Traversing arrays
    
- Solving pattern problems
    

---

# Flow of a for Loop

```text
Initialization
      ↓
Condition Check
      ↓
Loop Body
      ↓
Update
      ↓
Condition Check Again
```

Repeats until the condition becomes false.

---

# Java while Loop

The `while` loop is used when the number of iterations is not known beforehand.

## Syntax

```java
while (condition) {
    // code
}
```

---

## Example 4: Print Numbers from 1 to 5

```java
public class Main {
    public static void main(String[] args) {

        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            count++;
        }
    }
}
```

### Output

```text
1
2
3
4
5
```

---

## Example 5: Countdown

```java
public class Main {
    public static void main(String[] args) {

        int modulesLeft = 4;

        while (modulesLeft >= 1) {
            System.out.println("Modules left: " + modulesLeft);
            modulesLeft--;
        }
    }
}
```

### Output

```text
Modules left: 4
Modules left: 3
Modules left: 2
Modules left: 1
```

---

## When to Use while Loop?

Use a `while` loop when:

- Iterations are unknown
    
- Waiting for user input
    
- Loop depends on a condition
    
- Processing until something becomes false
    

---

# Java do-while Loop

The `do-while` loop executes the body at least once.

## Syntax

```java
do {
    // code
} while (condition);
```

Notice the semicolon after `while(condition)`.

---

## Example 6: Revision Rounds

```java
public class Main {
    public static void main(String[] args) {

        int revisionRound = 1;

        do {
            System.out.println("Revision Round: " + revisionRound);
            revisionRound++;
        } while (revisionRound <= 3);
    }
}
```

### Output

```text
Revision Round: 1
Revision Round: 2
Revision Round: 3
```

---

## Example 7: Runs At Least Once

```java
public class Main {
    public static void main(String[] args) {

        int score = 10;

        do {
            System.out.println("This runs once.");
        } while (score > 50);
    }
}
```

### Output

```text
This runs once.
```

Even though the condition is false, the loop body executes once.

---

# while vs do-while

|Feature|while|do-while|
|---|---|---|
|Condition Checked|Before execution|After execution|
|Minimum Executions|0|1|
|Use Case|Condition-based loops|Menus and prompts|

---

## Example Comparison

### while

```java
int x = 10;

while (x > 20) {
    System.out.println("Hello");
}
```

Output:

```text
No Output
```

### do-while

```java
int x = 10;

do {
    System.out.println("Hello");
} while (x > 20);
```

Output:

```text
Hello
```

---

# Enhanced for Loop (For-Each Loop)

Used when you only need the values and not the index.

## Syntax

```java
for (datatype variable : collection) {
    // code
}
```

## Example

```java
int[] nums = {10, 20, 30};

for (int num : nums) {
    System.out.println(num);
}
```

### Output

```text
10
20
30
```

### When to Use?

- Traversing arrays
    
- Traversing collections
    
- When index is not required
    

---

# Infinite Loops

If a loop condition never becomes false, the loop runs forever.

This is called an infinite loop.

---

## Example 8: Infinite while Loop

```java
while (true) {
    System.out.println("This keeps running forever");
}
```

---

## Example 9: Infinite for Loop

```java
for (;;) {
    System.out.println("Infinite loop");
}
```

---

## Common Causes

- Missing update statement
    
- Incorrect condition
    
- Variable not changing
    

Example:

```java
int num = 1;

while (num <= 5) {
    System.out.println(num);
}
```

This loop never ends because `num++` is missing.

---

# Nested Loops

A loop inside another loop is called a nested loop.

Used in:

- Pattern problems
    
- Matrices
    
- Grids
    
- Table generation
    

---

## Example 10: Square Pattern

```java
public class Main {
    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++) {

            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```

### Output

```text
* * *
* * *
* * *
```

### Understanding

- Outer loop → Rows
    
- Inner loop → Columns
    

---

# Loop Control Statements

Java provides:

- `break`
    
- `continue`
    

---

# break Statement

Stops the loop immediately.

## Example 11

```java
for (int testCase = 1; testCase <= 6; testCase++) {

    if (testCase == 4) {
        break;
    }

    System.out.println(testCase);
}
```

### Output

```text
1
2
3
```

---

# continue Statement

Skips the current iteration and moves to the next one.

## Example 12

```java
for (int day = 1; day <= 5; day++) {

    if (day == 3) {
        continue;
    }

    System.out.println(day);
}
```

### Output

```text
1
2
4
5
```

---

# Loop Selection Cheat Sheet

|Situation|Loop|
|---|---|
|Known iterations|for|
|Unknown iterations|while|
|Must execute once|do-while|
|Pattern problems|for|
|Array traversal|for|
|Menu systems|do-while|

---

# Loops and Complexity

Loops are closely related to Time Complexity.

## Single Loop

```java
for (int i = 0; i < n; i++)
```

Time Complexity:

```text
O(n)
```

---

## Nested Loop

```java
for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
```

Time Complexity:

```text
O(n²)
```

---

## Halving Loop

```java
for (int i = n; i > 1; i /= 2)
```

Time Complexity:

```text
O(log n)
```

---

# Common Beginner Mistakes

## 1. Forgetting Update

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
}
```

Results in an infinite loop.

---

## 2. Wrong Condition

```java
for (int i = 1; i >= 5; i++) {
    System.out.println(i);
}
```

Loop never runs.

---

## 3. Extra Semicolon

```java
for (int i = 1; i <= 5; i++);
{
    System.out.println("Hello");
}
```

The semicolon ends the loop.

---

## 4. Confusing while and do-while

Remember:

```text
while    → checks first
do-while → runs first
```

---

## 5. Poor Variable Names

Prefer:

```java
row
col
i
j
index
count
```

instead of unclear names.

---

# Interview and DSA Relevance

Loops are used in:

- Arrays
    
- Strings
    
- Searching
    
- Sorting
    
- Pattern Problems
    
- Dynamic Programming
    
- Matrix Traversal
    

Strong loop fundamentals make DSA significantly easier.

---

# Practice Questions

1. Print numbers from 1 to 10 using a for loop.
    
2. Print numbers from 10 to 1 using a while loop.
    
3. Print the first 5 even numbers.
    
4. Print the multiplication table of 7.
    
5. Create a menu using do-while.
    
6. Find the sum of numbers from 1 to n.
    
7. Print an n × n square pattern.
    
8. Print odd numbers from 1 to 20 using continue.
    
9. Stop a loop when the value becomes 6 using break.
    

---

# Quick Summary

Java provides three primary loops:

- `for` → Fixed repetitions
    
- `while` → Condition-based repetitions
    
- `do-while` → At least one execution
    

Also remember:

- `break` stops a loop
    
- `continue` skips an iteration
    
- Nested loops are used for patterns and grids
    
- Missing updates can create infinite loops
    

---

# Final Takeaway

Loops are not just another Java topic.

They are one of the strongest foundations of programming.

If conditionals teach your program **how to decide**,

then loops teach your program **how to repeat logic efficiently**.

This is why loops appear everywhere:

- Beginner programs
    
- Pattern problems
    
- DSA
    
- Real-world software systems
    

Mastering loops forms the bridge between:

```text
Basic Syntax
      ↓
Logical Programming
      ↓
Problem Solving
      ↓
Data Structures & Algorithms
```

## Code Folder
- [ch03_loops](../../src/javakb/ch03_loops)
