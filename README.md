# Final-OOP
Name: Keanna Forbes
CS 334A: Object-Oriented Programming
Mr. Brian Holbert
Bethune-Cookman University

This project was created for my CS 334 A: Object-Oriented Programming class. It demonstrates the OOP concepts of inheritance, abstract classes, and interfaces. The program simulates a simple library management system where users can search for items and manage borrowed items. It features:

Inheritance:
LibraryItem is the superclass with two subclasses:
Book: Represents books with an author
DVD: Represents DVDs

Abstract Classes:
LibraryUser is an abstract class implemented by Student to handle user-related operations

Interfaces:
Searchable interface allows searching for items by title

Class Structure
LibraryItem: Superclass for library items 
Book: Subclass of LibraryItem that includes the author's name
DVD: Subclass of LibraryItem
Searchable: Interface for searching items by title
LibraryUser: Abstract class for library users
Student: Subclass of LibraryUser representing a student

**How to Run the Program**
1. Save all .java files in the same directory.
2. Make sure you have Java installed on your computer.
3.Open a terminal or command prompt, navigate to the project folder, and compile all files: "javac *.java"
4. Run the program by executing the Main class: "java Main"
