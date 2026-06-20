# Chapter 1: Java Basics

## Simple Intuition

Before you can make decisions (Chapter 2) or repeat actions (loops), a program needs two things: a way to **store information** and a way to **talk to the outside world** (read input, print output). This chapter is purely about those two things — nothing here makes decisions or repeats, it just sets up the vocabulary every later chapter depends on.

Think of it like learning the alphabet before writing sentences. Variables are your nouns, arithmetic operators are your verbs, and `printf`/`Scanner` are how you actually communicate the result to someone.

---

## 1. [HelloWorld.java](../../src/javakb/ch01_basics/HelloWorld.java) — Program Structure

**Concept:** Every Java program needs an entry point — the JVM looks for exactly one method to start running: `public static void main(String[] args)`. Nothing executes outside of it (directly).

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("My name is Harsh");
    }
}
```

**`println` vs `print`:** `println` adds a newline after printing; `print` doesn't. Run the two lines above and you'll notice "My name is Harsh" sticks right onto the end of whatever comes next — that's `print` doing exactly what it's supposed to.

**Why this matters beyond syntax:** `public class HelloWorld` must match the **filename** (`HelloWorld.java`) exactly, including capitalization. This single rule trips up almost every beginner once — Java is case-sensitive and strict about file-to-class naming.

---

## 2. [VariablesAndDataTypes.java](../../src/javakb/ch01_basics/VariablesAndDataTypes.java) — Storing Data

**Concept:** A variable is a named, typed container. The type tells Java how much memory to reserve and what operations are valid on it.

**Primitive types** (store the actual value directly):

|Type|Example|Description|
|---|---|---|
|`int`|`10`|Whole numbers|
|`double`|`3.14`|Decimal numbers (default for decimals)|
|`float`|`3.14f`|Smaller-precision decimals|
|`long`|`100000L`|Large integers beyond `int` range|
|`char`|`'A'`|Single character (single quotes)|
|`boolean`|`true`|True or false only|

**Reference type:**

|Type|Example|
|---|---|
|`String`|`"Hello World"` (double quotes)|

**Intuition for primitive vs reference:** A primitive variable _is_ the value — `int x = 10` literally holds 10 in that memory slot. A reference variable holds an _address_ pointing to an object elsewhere in memory. This distinction seems academic now, but it's exactly why `String` comparisons with `==` misbehave later (you're comparing addresses, not content) — keep this in the back of your mind for Chapter 6.

**Constants:**

```java
final double PI = 3.14159;
```

`final` means "assign once, never reassign." Trying to change it later is a compile error, not a runtime surprise — Java catches this for you before the program even runs.

**Common mistake:** Forgetting the `f` suffix on float literals.

```java
float num = 3.14;   // won't compile — 3.14 is a double by default, too "wide" to fit in float
float num = 3.14f;  // correct
```

---

## 3. [UserInput.java](../../src/javakb/ch01_basics/UserInput.java) — Talking to the User

**Concept:** Programs that only print fixed text aren't very useful. `Scanner` reads what the user types from the keyboard (`System.in`) and converts it into usable data.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int age = scanner.nextInt();
```

**Common Scanner methods:**

|Method|Purpose|
|---|---|
|`nextInt()`|Reads an integer|
|`nextDouble()`|Reads a decimal|
|`nextBoolean()`|Reads true/false|
|`next()`|Reads a single word (stops at whitespace)|
|`nextLine()`|Reads the entire line, including spaces|

**The buffer problem (the most important thing in this section):** `nextInt()` reads the number but leaves the **leftover newline character** sitting in the input buffer. If your very next call is `nextLine()`, it doesn't wait for new input — it immediately grabs that leftover empty newline and returns `""`.

```java
int age = scanner.nextInt();
scanner.nextLine();              // consumes the leftover newline — "buffer flush"
String name = scanner.nextLine(); // now this actually waits for real input
```

**Analogy:** Imagine a checkout line where `nextInt()` takes your item but leaves your receipt sitting on the counter. If the next customer (`nextLine()`) just grabs whatever's on the counter without looking, they get your receipt, not their own item. You have to clear the counter (`scanner.nextLine()` with no assignment) before the next real read.

**Common mistake:** Skipping this flush and being confused why a `nextLine()` call right after `nextInt()`/`nextDouble()` returns an empty string instead of waiting for input.

---

## 4. [ArithmeticOperations.java](../../src/javakb/ch01_basics/ArithmeticOperations.java) — Doing Math

**Concept:** Standard arithmetic, plus one operator beginners haven't seen before school-level math: modulus.

|Operator|Meaning|
|---|---|
|`+`|Addition|
|`-`|Subtraction|
|`*`|Multiplication|
|`/`|Division|
|`%`|Modulus (remainder after division)|
|`++`|Increment by 1|
|`--`|Decrement by 1|

```java
int sum = a + b;
int remainder = a % b;
```

**Why `%` matters more than it looks:** Modulus is how you check even/odd (`n % 2 == 0`), wrap values around a fixed range (clock arithmetic, circular buffers), and extract digits from a number. You'll use it constantly once you hit loops and DSA — it's not a minor operator.

**Integer division trap:** `7 / 2` in Java gives `3`, not `3.5` — because both operands are `int`, Java does **integer division** and truncates the decimal. To get `3.5`, at least one operand needs to be a `double`: `7.0 / 2` or `(double) 7 / 2`.

**Common mistake:** Dividing by zero.

```java
if (b != 0) {
    System.out.println(a / b);
}
```

Integer division by zero throws `ArithmeticException` and crashes the program (unlike floating-point division by zero, which gives `Infinity` instead of crashing — worth knowing the difference exists, even if you don't need it yet).

---

## 5. [MathClassDemo.java](../../src/javakb/ch01_basics/MathClassDemo.java) — Built-in Math Helpers

**Concept:** `Math` is a utility class — you never create a `Math` object, you just call its methods directly using the class name, because every method is `static`.

```java
Math.max(a, b)     // larger of the two
Math.min(a, b)     // smaller of the two
Math.abs(x)        // absolute value
Math.sqrt(x)        // square root
Math.pow(base, exp) // exponentiation
Math.round(x)       // rounds to nearest whole number
Math.floor(x)        // rounds down
Math.ceil(x)         // rounds up
Math.random()         // random double between 0.0 (inclusive) and 1.0 (exclusive)
```

```java
double result = Math.pow(2, 3);
```

Output:

```
8.0
```

**Why it returns `8.0` and not `8`:** `Math.pow` always returns a `double`, even when the result is a whole number — this is consistent behavior across the class, useful to remember so you're not surprised by the `.0`.

---

## 6. [PrintfFormatting.java](../../src/javakb/ch01_basics/PrintfFormatting.java) — Clean Output

**Concept:** `println` concatenation gets messy fast when mixing types. `printf` uses **format specifiers** as placeholders, keeping the template readable.

|Specifier|Meaning|
|---|---|
|`%s`|String|
|`%d`|Integer|
|`%f`|Decimal (default 6 decimal places)|
|`%.2f`|Decimal, exactly 2 places|
|`%c`|Character|
|`%b`|Boolean|
|`%n`|Newline (platform-independent — prefer over `\n` in `printf`)|

```java
System.out.printf("CGPA: %.2f", cgpa);
```

Output:

```
CGPA: 8.95
```

**Why `%.2f` matters for real programs:** Without it, printing a `double` like `8.9500000001` (a common floating-point artifact) looks unprofessional. Controlling decimal precision is something you'll want in nearly every program that displays money, grades, or percentages.

---

## Recap: What Each Tool Is For

|Need|Use|
|---|---|
|Store a value|variable + matching primitive/reference type|
|Value that should never change|`final`|
|Read what the user types|`Scanner`|
|Switching from `nextInt()`/`nextDouble()` to `nextLine()`|flush with an extra `scanner.nextLine()` first|
|Basic math|`+ - * / %`|
|Math beyond basic operators (sqrt, power, rounding, random)|`Math` class|
|Clean, controlled-precision output|`printf` with format specifiers|

---

## Common Beginner Mistakes (Full List)

1. **Missing `f` suffix on float literals** — `float num = 3.14;` won't compile; needs `3.14f`.
2. **Using `=` instead of `==`** — `=` assigns, `==` compares. `if (age = 18)` is a logic error waiting to happen (and won't compile for primitives used as conditions in Java, but the habit carries into other contexts).
3. **Forgetting to flush the Scanner buffer** — calling `nextLine()` right after `nextInt()`/`nextDouble()` without an extra flush call.
4. **Dividing by zero** — crashes with `ArithmeticException` for integer division; always guard with a zero-check.
5. **Forgetting semicolons** — every statement needs one; Java won't infer the end of a line like Python does.

---

## Mini Project

**[CompoundInterestCalculator.java](../../src/javakb/projects/beginner/CompInterest.java)**

Combines everything in this chapter into one practical program:

- Variables to store principal, rate, and time
- `Scanner` to take user input for those values
- Arithmetic + `Math.pow()` to compute the compound interest formula
- `printf` to display the final amount cleanly, rounded to 2 decimal places

This is intentionally the first project where none of the pieces are new — the skill being tested is **combining** them correctly, not learning new syntax.

For the code of this project, refer to the [beginner project folder](../../src/javakb/projects/beginner/CompInterest.java).