# Software Design Patterns: Assignment #2
## Factory Method & Abstract Factory

**Topic:** Doner Shop System  
**Description:** This project implements both the Factory Method (Part A) and Abstract Factory (Part B) design patterns to model a Doner shop that serves different types of single items (Beef/Chicken Doners) and combined Meals (Authentic Kazakh Meal vs. Student Meal).

---

## Clean Code Principles Applied

In accordance with Section 3 of the assignment requirements, the following five Clean Code principles have been explicitly applied and justified in the implementation:

### 1. Meaningful, Intention-Revealing Names
**Justification:** Variables, methods, and classes use highly descriptive domain-specific names that communicate their purpose instantly without requiring comments. 
**Before (Hypothetical / Bad Practice):**
```java
Factory1 f1 = new Factory1();
Doner d1 = f1.create();
```
**After (From Actual Code):**
```java
DonerFactory chickenDonerFactory = new ChickenDonerCreator();
Doner myOrderChickenDoner = chickenDonerFactory.createDoner();
```

### 2. Small, Focused Classes (Single Responsibility Principle)
**Justification:** Every class is small and focuses on exactly one task, adhering strictly to the Single Responsibility Principle. A concrete factory *only* creates its specific products, and a concrete product *only* holds its own specific preparation logic.
**Before (Hypothetical / Bad Practice):**
```java
public class RestaurantManager {
    public Doner makeDoner(String type) {
        if (type.equals("beef")) { return new BeefDoner(); }
        else if (type.equals("chicken")) { return new ChickenDoner(); }
        return null;
    }
}
```
**After (From Actual Code):**
```java
public class BeefDonerCreator implements DonerFactory {
    @Override
    public Doner createDoner() {
        return new BeefDoner();
    }
}
```

### 3. Programming to an Interface, Not an Implementation
**Justification:** The client (`Main.java`) relies entirely on abstractions (`MealFactory`, `Doner`, `Drink`). By abstracting away the concrete classes, the code becomes loosely coupled and easily extensible without modifying the client logic.
**Before (Hypothetical / Bad Practice):**
```java
StudentMealFactory studentMealFactory = new StudentMealFactory();
ChickenDoner anotherDoner = new ChickenDoner();
Cola anotherDrink = new Cola();
```
**After (From Actual Code):**
```java
// Works entirely through abstract interfaces
MealFactory studentMealFactory = new StudentMealFactory();
Doner anotherDoner = studentMealFactory.createDoner();
Drink anotherDrink = studentMealFactory.createDrink();
```

### 4. Small Methods (Doing One Thing)
**Justification:** All methods in the codebase are concise (often 1-3 lines) and perform exactly one well-defined action. They do not mix object creation with business logic or presentation.
**Before (Hypothetical / Bad Practice):**
```java
public void orderStudentMeal() {
    System.out.println("Preparing Chicken Doner...");
    System.out.println("Pouring Cola...");
}
```
**After (From Actual Code):**
```java
// Logic is separated into distinct, one-line operations
@Override
public Doner createDoner() {
    return new ChickenDoner();
}

@Override
public Drink createDrink() {
    return new Cola();
}
```

### 5. Consistent Formatting & Required Annotations
**Justification:** The codebase uses standard Java indentation and structural formatting uniformly. Furthermore, the `@Override` annotation is strictly used everywhere an interface method is implemented, making the developer's intent explicit and allowing the compiler to catch errors if the interface changes.
**Before (Hypothetical / Bad Practice):**
```java
public class Cola implements Drink{
public void pour(){ System.out.println("pouring Cola..."); }
}
```
**After (From Actual Code):**
```java
public class Cola implements Drink {
    @Override
    public void pour() {
        System.out.println("pouring Cola...");
    }
    
    @Override
    public String toString() {
        return "Drink: Cola";
    }
}
```
