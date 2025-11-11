## 📄 Description - Exercise Statement

This is the third task for **Sprint 1. Java Language** in the **Backen Java Course** in ITAcademy (Barcelona, Spain).
There are 3 levels with exercises.

## Level 1

### Exercise 1

Create a class called Month with an attribute "name" (which will store the name of the month of the year). Add 11 Month objects (each with its own attribute) to an ArrayList, except for the object with the attribute "August." Then, insert it in the correct place for that month and demonstrate that the ArrayList maintains the correct order.

Convert the ArrayList from the previous exercise into a HashSet and ensure that it does not allow duplicates.

Iterate over the list with a for-loop and with an iterator.

### Exercise 2

Create and fill a List.

Create a second List and insert into this second list the elements from the first list in reverse order.

Use ListIterator objects to read the elements from the first list and insert them into the second.

### Exercise 3

Given the file `countries.txt` (check the resources section) that contains countries and capitals. The program must read the file and store the data in a `HashMap<String, String>`. The program asks for the user's name, and then it should display a country randomly stored in the HashMap. The user must then write the name of the capital of that country. If correct, they earn one point. This action is repeated 10 times. After asking for the capitals of 10 randomly selected countries, the program must save the user's name and their score in a file called `classification.txt`.

* * *

## Level 2

### Exercise 1

Create a class called Restaurant with two attributes: name (String) and score (int). Implement the necessary methods so that Restaurant objects with the same name and score cannot be introduced into a HashSet created in the main() of the application.

**Important**

There may be restaurants with the same name and different scores, but there cannot be restaurants with the same name and the same score.

### Exercise 2

Using the class from the previous program, create the necessary implementation so that the Restaurant objects are ordered by name and by score in descending order.

Example:

-   name: restaurant1, score: 8
-   name: restaurant1, score: 7

* * *

## Level 3

### Exercise 1

Create an application capable of reading a CSV file. This file has 3 fields: name, surname, and ID number (DNI), for each record. It is necessary to sort the people read from the file by their name, surname, or DNI. You may use the list you find most suitable.

The Person class has 3 attributes:

-   name
-   surname
-   DNI

The main class has the following menu:

1.  Enter person.
2.  Show people sorted by name (A-Z).
3.  Show people sorted by name (Z-A).
4.  Show people sorted by surname (A-Z).
5.  Show people sorted by surname (Z-A).
6.  Show people sorted by DNI (1-9).
7.  Show people sorted by DNI (9-1).
8.  Exit.

The program should list the people as in the following example:


_Nom_     |  _Cognoms_         |  _NIF_
 ---      |  ---               | ----
Andreu    |  Ballestero Llenas |  34835767J 
Miquel    |  Bayona Font       |  48743957B 
Guillem   |  Capdevila Riu     |  33957834J 
Albert    |  Carbonell Ferrer  |  77364986R
Ferran    |  Casas Coderch     |  23047848P
Maria     |  Casellas Fuste    |  47102244S
Genis     |  Ciutat Vendrell   |  39718459N 



## 📋 Requirements

Developed with:
- *IDE* : IntelliJ IDEA 2025.2.4 (Community Edition)
- *Java version* : openjdk 21.0.8 2025-07-15

## 🛠️ Installation

Fork or download this repo.

## ▶️ Execution

Run with *IntelliJ IDEA 2025.2.4* or import to your favorite IDE.

This code has been only tested under:
- *IDE* : IntelliJ IDEA 2025.2.4 (Community Edition)
- *Java version* : openjdk 21.0.8 2025-07-15

>  When run **Level 1/ Exercise 3** with *IntelliJ*  the file `classification.txt` will be located on main folder where you commit this task.
