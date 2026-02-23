
---

##  Class Descriptions

### `Aparat`
Abstract base class that defines shared behavior:
- `schimba_starea(Rezultat)`
- `cost_mentenanta(Rezultat)`
- shared static resource (`curent`)

---

### `MasinaTunsIarba`
Represents a lawn mower.

Features:
- Multiple constructors (default, full, copy)
- Getters and setters (encapsulation)
- `Serializable` implementation
- Overridden abstract methods
- Custom `toString()` for readable output

---

### `Motosapa`
Represents a tiller.

Features:
- Multiple constructors
- Encapsulation via getters/setters
- `Serializable`
- Overridden abstract methods
- Custom `toString()`

---

### `Rezultat`
Helper data class used to store:
- `produs`
- `curent_consumat`
- `functionare_ramasa`

Used by equipment classes to:
- Update internal state
- Calculate maintenance costs

---

### `Main`
Entry point of the application.

Responsibilities:
- Creates multiple objects of both types
- Stores them in `ArrayList`
- Filters objects based on conditions:
  - minimum power
  - brand
  - weight
  - electric start
- Sorts lawn mowers by power
- Displays recommended equipment
- Saves objects to text files using `PrintWriter`

---

## Functionality Demonstrated

✔ Object creation and constructor overloading  
✔ Copy constructors  
✔ Polymorphism via abstract class  
✔ Filtering using loops and conditions  
✔ Manual sorting algorithm  
✔ File writing (`.txt` export)  
✔ Static shared resource management  

---

##  Technologies Used

- Java
- OOP principles
- Java Collections Framework
- Java File I/O

---

##  Example Use Cases

- Display all available lawn mowers
- Filter mowers by minimum power and brand
- Sort equipment by power (ascending)
- Identify tillers suitable for large surfaces
- Calculate maintenance cost based on usage
- Save equipment data to text files

---

## Learning Objectives

This project was created to practice and demonstrate:

- Designing class hierarchies
- Implementing abstract methods
- Working with collections
- Structuring a multi-class Java project
- Applying clean OOP structure

---

##  Possible Improvements

Future enhancements could include:

- Replacing manual sorting with `Comparator`
- Using Streams API
- Adding unit tests (JUnit)
- Implementing user input validation
- Converting to Maven project structure
- Adding GUI interface

---

##  Repository Topics

`java` `oop` `inheritance` `polymorphism` `arraylist` `file-io`

---

## Author

Developed as an Object-Oriented Programming practice project.
