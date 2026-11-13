# Task 10 – Packages and Encapsulation

This folder contains the packaged implementation used to demonstrate `parking.model`, `parking.service`, and `parking.app`. Model fields are private, constructors validate registration numbers, and public getters expose required state. Compile from this folder with:

```powershell
javac -d out src/parking/model/*.java src/parking/service/*.java src/parking/app/*.java
java -cp out parking.app.Main
```

The same integrated implementation is expanded and tested in Task 11.
