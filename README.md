# CSC1120 Code
This repository contains code written in Dr. Taylor's lectures
for CSC1120, Data Structures and Graphical Interfaces.

# Week 6
## Announcements
- I will be out after lab on Thursday, 10/5, returning to campus Wednesday, 10/11
- Get started on lab early - no office hours Monday, 10/9
- Will try to be online for questions noon-4pm Saturday, 10/7
- Exam I is next Tuesday, next Monday will be a practice exam
- Recommend watching Prof. Colleen Lewis' videos on learncs.online for this week on LinkedList

# Week 5
## Announcements
- Quiz this week is online survey
- This week's lab is LearnCS.Online problems
  - Try to do these in the browser rather than in IntelliJ - practice for quiz/exam
  - Upload screenshots with console output
- Have released lab for next week for those who want to start early

# Week 4
## Announcements
- First year seminar noon-1pm Tuesday
- Lunch with a professor 11am-12:30pm Tuesday
- First commit for lab due prior to lab
- Should have your grades to date
- Half-way to first exam

# Week 3
## Announcements
- All lab 1 submissions should be graded and returned
- Video on how to view my feedback (please watch)
- Office hours today: 7am-8am, 9am-10:30am
- Lab 2 due on Thursday
- Homework growing pains
  + JavaFX homework not testing correctly
  + submissions changing to screenshots (hopefully temporarily)

# Week 2
## Announcements
- Grading lab 1 submissions
  + Goal to return labs within a day of submission, unless submitted late
- Incremental commits for lab 2 (first due today)
- Homework and reading quiz due Sunday
- My availability
  + Not available on Sundays
  + Not available after 5pm the day lab is due

# Week 1
## Announcements
- First Year Seminar in Programming today at Noon in DH Auditorium
- Lunch with Professor - TODAY 11:30am
- Extra office hours today 9am-10:30am
- Image/WriteableImage design intended to mimic javafx.scene.image package classes
- For Wednesday lab, access ITC from Broadway (across from CC building)

## Typical Weekly Schedule
- Lectures MTF
- Labs **due** Monday
- Start next lab on Tuesdays
- Homework and reading quizzes **due** Sunday
- **Quiz** at beginning of lab (W or R)
- Exam I, Tuesday, Oct. 10
- Exam II, Tuesday, Nov. 14
- Final exam, TBD, week of Dec. 10

## Review

### Writing Computer Software
- .java and .class files, javac converts to byte code
- JVM translates byte code to machine code
- IntelliJ IDE

### Primitive datatypes, Variables, Identifiers
- Primitive and reference types
- Be aware of the memory requirements and value ranges for primitive types
- Use most appropriate type - int for a count
- Assignment operator - assigned on left side
- Reference variable holds copy of address, not value
- Use meaningful variable, method, and class names
- Arithmetic operators: +, -, *, /, % and compound assignment operators: =+, ...
- Increment/Decrement, both pre- and post-
- Operator precedence, avoid divide by zero
- Automatic type promotion, Casting primitives
- Use wrapper classes to convert from string to numeric
- Use if, if/else, while, for, enhanced for loop, do-while, and switch statements
- Boolean operators: <, <=, !=, ==, >=, >, &&, ||, !
- When to use == vs equals()
- Variable scope
- Java packages - fully qualified name, package and import statements
- Arrays of primitives and references
- Loop through an array
- Multi-dimensional arrays
- Passing and returning primitives, references, and references to arrays
- Use mathematical operations to manipulate characters
- Use short-circuit evaluation to avoid divide-by-zero and null-pointer exceptions

### Problem Solving
- Translate requirements into code
- Flowcharts and pseudocode (embed as comments)
- Trace code without debugger
- Use debugger to step through code

### Standard Java Classes
- String class and string literals - length(), charAt(), indexOf(), substring()
- Math class - PI, abs(), pow(), sqrt(), max(), min(), log(), trig (radians)
- Character class - isDigit(), toLowerCase()
- Random class
- Scanner - hasNext(), next(), nextInt(), nextDouble(), nextLine()
- System.out
- ArrayList - isEmpty(), size(), add(), add(int, E), indexOf(), get(), set(), remove()
- Interpret Oracle javadoc

### Object Oriented Design / Object Oriented Programming
- Object types (Classes)
- Class instances (Objects)
- Instance variables (Attributes/Fields)
- Instance behaviors/actions (Methods)
- Class variables (Attributes/Fields)
- Class constants
- Class behaviors (Methods)
- Visibility modifiers - private, none, protected, public
- Distinguish between local, instance, and class variables
- Understand the importance of information hiding and encapsulation
- Describe the role of the reserved word this
- Constructors - calling other constructor with this()
- Describe the role of the garbage collector
- Compare the equality of two different objects
- Understand the implications of acting on an object to which there are multiple references
- Overload method

### Interfaces/Inheritance
- Be comfortable with inheritance concepts
- Extend a classes and implement interfaces
- Use interface references
- Differences between abstract classes and interfaces, when to use which
- Implications of no default constructor in super class
- Call methods/constructor of parent class
- Understand method overriding and the @Override annotation
- Understand the implications of a method or class having a final access modifier
- Explain the role of the Object class
- Explain how automatic type promotion works with object references
- Override the equals() and toString() methods for user defined classes
- Explain the relationship between a reference type and the type of the object to which the reference points
- Explain the concept of polymorphism/dynamic binding

### UML
- Read and understand UML class diagrams including connectors specifying aggregation, implementation, and inheritance
- Implement source code that meets the design specified in a UML class diagram

### Exception Handling
- Exceptions - try, catch, throw, throws, finally
- Appropriately handle exceptions - catching exceptions in the right place
- Distinguish between checked and unchecked exceptions
- Use multiple catch blocks to customize the way different types of exceptions are handled
- Inspect a call stack trace displayed by an unhandled exception to determine what caused the exception to be thrown

### Files and Directories
- Read/write both text and binary files
- Use relative paths rather than hardcoding to a specific directory location
- Use following classes: Path, Paths, File, Files, InputStream, OutputStream
- Use FileInputStream/FileOutputStream for low-level binary input/output
- Use DataInputStream/DataOutputStream for high-level binary input/output
- Use Scanner/PrintWriter for text input/output
- Be familiar with file IO exception classes
 
### Java Coding Standard
- Comments - javadoc, block comments, line comment
- Avoid magic numbers
- Use conditional to control flow of program - avoid break and multiple return statements
- Favor readable code over clever code
- Apply MSOE coding standard
- Use helper methods to avoid redundant code
- Simplify complicated algorithms by encapsulating subordinate tasks
- Use mechanisms in IntelliJ to refactor software
- Document each method using the Javadoc convention
- Describe how encapsulation can improve software security
- Describe how avoiding duplicate code can improve software security
- Demonstrate how validating input can improve software security
- Demonstrate how creating copies of mutable output values can improve software security
- Explain how public static final fields that are not constants can create security vulnerabilities
- Make use of final to guard against data corruption

### Documentation and Distribution
- Generate HTML documentation using the Javadoc tool
- Generate executable JAR files