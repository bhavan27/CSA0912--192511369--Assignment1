# CSA09 Java Assignment 1 – Campus Smart-Parking System

Starter implementation and execution evidence for the CO1 Java assignment. Uses Java 17+.

## Folder guide
- `Task03/` – completed jagged-array slot allocation/release program, sample input and captured output.
- `Task04-07-09-10/` – runnable OOP demonstration for constructors, static members, inheritance, overriding, abstraction and interface concepts.
- `Task08/` – runnable fee calculation, overloading, overriding, interface and dynamic dispatch demonstration.
- `Task11/` – integrated parking facility with tickets, vehicle categories, monthly-pass handling and test cases.
- `Task12/` – adapted facility with e-bikes, delivery vans, one-day passes and five unequal floors.
- `evidence/` – copies of the captured output text and PNGs.

Tasks 1 and 2 in the supplied assignment are primarily analysis/design tasks and do not require standalone Java programs.

## Compile and run (from this project folder)

### Task 3
```bash
javac -d out3 Task03/ParkingFacility.java
java -cp out3 ParkingFacility
```

### Tasks 4–7 demonstration
```bash
javac -d out47 Task04-07-09-10/OOPConceptDemo.java
java -cp out47 OOPConceptDemo
```

### Task 8
```bash
javac -d out8 Task08/FeeDemo.java
java -cp out8 FeeDemo
```

### Tasks 9–10 package demonstration
```bash
javac -d out910 Task04-07-09-10/OOPConceptDemo.java
java -cp out910 OOPConceptDemo
```

### Task 11
```bash
javac -d out11 Task11/src/parking/model/*.java Task11/src/parking/service/*.java Task11/src/parking/app/*.java
java -cp out11 parking.app.Main
```

### Task 12
```bash
javac -d out12 Task12/src/parking/model/*.java Task12/src/parking/service/*.java Task12/src/parking/app/*.java
java -cp out12 parking.app.Main
```

## Evidence and input files
Each coding task has an `output.txt` file containing the program output captured after compilation and execution. Matching `output.png` files are included. Task 3 and Task 8 have sample input descriptions; Tasks 11 and 12 have test-case lists.

The PNG files are generated captures of actual program output, not screenshots of the VS Code window. If your faculty specifically requires screenshots, run the programs on your own computer and capture the terminal output in VS Code.

## Before submission
1. Add your name, register number, Java version and GitHub repository URL.
2. Check the assumed fee rates and pass rules against any additional instructions from your faculty.
3. Run every program yourself and understand it for the viva.
4. Keep your report (Tasks 1–12) as one consolidated document.
5. Commit progressively, with at least one meaningful commit per task.
