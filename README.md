# ☕ Java Knowledge Base

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Level-Beginner_to_Advanced-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Focus-OOP%20%7C%20Fundamentals%20%7C%20DSA-green?style=for-the-badge" />
</p>

---

## 📌 Overview

Welcome to the **Java Knowledge Base**! This repository is a structured, production-grade learning index documenting core Java programming concepts, from basic syntax up to advanced thread concurrency, object-oriented design, and interactive mini-projects.

It is structured to serve as an **educational guide** and reference directory for beginners pursuing a strong coding foundation before moving into Data Structures & Algorithms (DSA) and enterprise web development (Spring Boot).

---

## 🚀 Live Learning Path

```mermaid
graph TD
    A[Core Basics: Var, Math, Input] --> B[Control Flow & Loops]
    B --> C[Methods & Arrays]
    C --> D[Object-Oriented Programming OOP]
    D --> E[Inheritance, Abstraction & Polymorphism]
    E --> F[Encapsulation & Relationships]
    F --> G[Collections, Wrappers & Exceptions]
    G --> H[Advanced Basics: Generics, Concurrency, Files]
    H --> I[DSA & Spring Boot Prep]
```

---

## 📂 Repository Directory Layout

All files are structured inside the standard Java package: `com.harshwardhan.fundamentals.*`.

```text
java-knowledge-base/
├── README.md
├── LICENSE
├── .gitignore
│
└── src/
    └── com/
        └── harshwardhan/
            └── fundamentals/
                ├── fundamentals/       # Variables, User Input, Arithmetic, Printf
                ├── decisionmaking/     # If-Else, Switch, Logical Operators
                ├── iteration/          # Loops (While, For, Nested, Break/Continue)
                ├── methods/            # Methods, Overloading, Scope, Varargs
                ├── arrays/             # 1D, 2D Arrays, User Input, Linear Search
                ├── strings/            # String manipulation, Substring routines
                ├── objectoriented/     # Classes, Objects, Constructors, Statics
                ├── inheritance/        # Subclassing, Super, Overriding
                ├── abstraction/        # Abstract classes, Interfaces, Polymorphism
                ├── encapsulation/      # Getters, Setters, Data hiding
                ├── relationships/      # Aggregation and Composition
                ├── collections/        # ArrayList, HashMap, Wrapper classes
                ├── exceptions/         # Try-catch, throw, custom exceptions
                ├── filehandling/       # Read and Write file streams
                ├── generics/           # Generic classes and methods
                ├── datetime/           # Local Date Time APIs, Enum classes
                ├── concurrency/        # Multi-threading, Timers
                └── projects/
                    ├── beginner/       # Simple CLI calculators and utility tools
                    ├── intermediate/   # Complex CLI projects (e.g., Vending Machine)
                    └── advanced/       # Threaded, file-stored programs
```

---

## ⚙️ Getting Started & Run Instructions

### 📥 Prerequisites
* Install **JDK 17 or above**.
* Set up your `JAVA_HOME` environment variables.

### ▶️ Compiling & Running Packaged Java Code
Because this repository is organized using professional Java packages, compilation and execution require package-aware paths.

#### 1. Compile Code to an Output Folder
Navigate to the root directory of the repository (`java-knowledge-base/`) and use `-d` to specify the output target:
```bash
# Compile a specific class
javac -d out src/com/harshwardhan/fundamentals/objectoriented/ClassesAndObjects.java

# Compile all source files
javac -d out src/com/harshwardhan/fundamentals/**/*.java
```

#### 2. Run with Classpath Root
Run the class using its fully qualified name from the directory containing the compiled `.class` files (`out`):
```bash
# Run using the -cp (classpath) argument
java -cp out com.harshwardhan.fundamentals.objectoriented.ClassesAndObjects
```

---

## 🏆 Current Project Highlights

| Project Name | Path | Level | Description |
| :--- | :--- | :--- | :--- |
| **Compound Interest Calculator** | [CompInterest.java](file:///d:/Programming/oopspractise/src/com/harshwardhan/fundamentals/projects/beginner/CompInterest.java) | Beginner | Computes compound interest given principal, rate, times compounded, and term length. |
| **Car Demo (OOP Practice)** | [ClassesAndObjects.java](file:///d:/Programming/oopspractise/src/com/harshwardhan/fundamentals/objectoriented/ClassesAndObjects.java) | Beginner | Introduction to basic encapsulation, class instantiation, instantiation states, and methods. |
| **Console Vending Machine** | [VendingMachine.java](file:///d:/Programming/oopspractise/src/com/harshwardhan/fundamentals/projects/intermediate/VendingMachine.java) | Intermediate | A complete transaction engine simulating products, cart accumulation, stock updates, and change payout. |

---

## 👨‍💻 Author

**Harshwardhan**
* GitHub: [@harshwardhan1507](https://github.com/harshwardhan1507)
* Focus: Core Java • Software Architecture • DSA

---

## ⭐ Support & Contributions

If you find this repository helpful, consider starring the repository ⭐ or submitting a pull request to add more concepts or practice exercises!