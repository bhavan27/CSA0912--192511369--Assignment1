# CSA09 Java Assignment 1 – Campus Smart-Parking System

**Student:** V. C. Bhavan Bairav
**Register Number:** 192511369
**Course:** Programming in Java – CSA0912 (CO2)
**Assignment**: Assignment 1 – 50 Marks

This repository contains my Java Assignment 1, based on the Campus Smart-Parking System. The assignment is organised into 12 folders, with each folder covering a specific task, from basic Java concepts to the integrated parking system.

## Requirements

- **Java:** JDK 17 or later.
- Each executable task includes `output.txt`, `output.png` and `execution.txt` containing its execution evidence.
- `input.txt` or `test-cases.txt` contains sample inputs and scenarios wherever applicable.
- Some demonstration programs use fixed sample values in `main()` instead of interactive user input.

## Folder Structure

| Folder | Description |
|---|---|
| Task01 | Problem analysis, candidate classes, rules and assumptions |
| Task02 | Data types, array selection, type conversion and complexity analysis |
| Task03 | Jagged-array allocation and release |
| Task04 | Constructors, `this` keyword, constructor chaining and object creation |
| Task05 | Static counter and object lifecycle |
| Task06 | Vehicle inheritance hierarchy |
| Task07 | Method overriding and Object class methods |
| Task08 | Compile-time and runtime polymorphism, dynamic method dispatch |
| Task09 | Abstract Vehicle class and Chargeable interface |
| Task10 | Packages, private fields, constructors and access control |
| Task11 | Integrated campus parking implementation and test cases |
| Task12 | Extended parking system with e-bikes, delivery vans, one-day passes and five unequal floors |

Tasks 1 and 2 focus on analysis and design, so they contain design explanations and sample data rather than standalone Java programs.

## Compile and Run

For individual Java programs, open the respective task folder in VS Code and run the source file.

Alternatively, use the terminal:

```powershell
javac -d out *.java
java -cp out MainClassName
```

For Tasks 10–12, which use packages, run the following commands from the respective task folder:

```powershell
javac -d out src/parking/model/*.java src/parking/service/*.java src/parking/app/*.java
java -cp out parking.app.Main
```

## Git Workflow

The repository is organised task-wise to keep the implementation and progress easy to follow. Each task can be committed separately to maintain a clear development history.

## Execution Evidence

The repository includes program outputs and execution records for the executable tasks. The `.png` files are terminal-style captures of the actual program output, not screenshots of the VS Code window. The text output and execution files provide additional reference for verifying the results.
