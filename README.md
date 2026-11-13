# CSA09 Java Assignment 1 — Campus Smart-Parking System

This starter implementation is organised by assignment task. It uses Java 17.

## Contents
- `Task03/ParkingFacility.java` — completed jagged-array allocation/release program from Task 3.
- `Task08/FeeDemo.java` — completed inheritance, overriding, interface and polymorphism program from Task 8.
- `Task04-07-09-10/` — small runnable examples demonstrating constructors, static members, inheritance, overriding, abstraction, packages and encapsulation.
- `Task11/` — integrated parking-system implementation with tickets, passes, fee calculation and tests.
- `Task12/` — extended implementation with e-bikes, delivery vans, one-day passes and unequal floor capacities.

## Compile and run
Open a terminal in the project folder. For example:

```bash
javac Task03/ParkingFacility.java
java -cp Task03 ParkingFacility

javac Task08/FeeDemo.java
java -cp Task08 FeeDemo
```

For Task 11:
```bash
javac -d out Task11/src/parking/model/*.java Task11/src/parking/service/*.java Task11/src/parking/app/*.java
java -cp out parking.app.Main
```

For Task 12:
```bash
javac -d out12 Task12/src/parking/model/*.java Task12/src/parking/service/*.java Task12/src/parking/app/*.java
java -cp out12 parking.app.Main
```

For Task 4–7, 9 and 10:
```bash
javac Task04-07-09-10/OOPConceptDemo.java
java -cp Task04-07-09-10 OOPConceptDemo
```

## Important
1. Read and understand each class; your assignment includes a viva.
2. Run every program yourself and capture your own output screenshots.
3. Adjust rates, fee slabs and assumptions if your faculty has specified different values. The PDF gives examples, not a complete fixed tariff.
4. Add your name, register number, Java version and GitHub URL before submission.
5. Commit progressively: one or more meaningful commits per task.
