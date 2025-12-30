# Java Programming Portfolio

[![CI](https://github.com/oyebiyisunday/java-algorithms-oop/actions/workflows/ci.yml/badge.svg)](https://github.com/oyebiyisunday/java-algorithms-oop/actions/workflows/ci.yml)

This repository demonstrates my core Java skills through algorithmic problem-solving and object-oriented programming (OOP) design.

---

## ✨ Highlights

- 6 focused tasks covering algorithms and OOP fundamentals
- 22 JUnit 5 tests with clean Maven build
- CI runs tests on every push and pull request
- Input validation and defensive programming patterns

---

## 🚀 Skills Demonstrated

- Java syntax fundamentals
- Algorithms using arrays and recursion
- Automated testing with JUnit 5
- Object-oriented programming:
  - Encapsulation (`private` fields)
  - Inheritance and polymorphism
  - Abstract classes and method overriding
  - Using `Comparator` for custom sorting
- Exception handling and validation
- Structured project organization
- CI automation with GitHub Actions

---

## 📁 Project Structure

```text
src/
  main/java/
    algorithms/    # Sorting, array manipulation, recursion
    oop/shapes/    # OOP design, polymorphism, geometry
docs/
  SAMPLE_OUTPUT.md # Real captured output from tests
  SKILLS_COVERED.md # Summary of Java skills this repo proves
```

---

## ✅ Build and Test

Run from the project root:

```powershell
mvn clean test
mvn -DskipTests package
```
