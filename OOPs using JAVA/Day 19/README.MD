### :trident: Object Oriented Programming using JAVA Day 19 Assignment :trident:
#### Platform used : Visual Studio Code and JDK 15 version
*********************************************************************************
### :computer: Assignment : 8
#### :link: Assignment Submission Link : https://forms.gle/7njwBMJnyikVLByE6
#### Last Date of Submission : 02.05.2021
**********************************************************************************

1. Write a Java program to show the use of all keywords for exception handling.
2. Write a Java program using try and catch to generate NegativeArrayIndex Exception and Arithmetic Exception.
3. Define an exception called “NoMatchFoundException” that is thrown when a string is not equal to “University”. Write a program that uses this exception.
4. Write a class that keeps a running total of all characters passed to it (one at a time) and throws anexception if it is passed a non-alphabetic character.
5. Write a program called Factorial.java that computes factorials and catches the result in an array of type long for reuse. The long type of variable has its own range. For example 20! Is as high as the range of long type. So check the argument passes and “throw an exception”, if it is too big or too small.

- If x is less than 0 throw an IllegalArgumentException with a message “Value of x must be positive”.
- If x is above the length of the array throw an IllegalArgumentException with a message “Result will overflow”.
Here x is the value for which we want to find the factorial.

6. Write a class that keeps a running total of all characters passed to it (one at a time) and throws an exception if it is passed a non-alphabetic character.
7. Write a program that outputs the name of the capital of the country entered at the command line. The program should throw a “NoMatchFoundException” when it fails to print the capital of the country entered at the command line.
8. Write a program that takes a value at the command line for which factorial is to be computed. The program must convert the string to its integer equivalent. There are three possible user input errors that can prevent the program from executing normally.
- The first error is when the user provides no argument while executing the program and an ArrayIndexOutOfBoundsException is raised. You must write a catch block for this.
- The second error is NumberFormatException that is raised in case the user provides a non-integer (float double) value at the command line.
- The third error is IllegalArgumentException. This needs to be thrown manually if the value at the command line is 0.
10. Create a user-defined exception named CheckArgument to check the number of arguments passed through the command line. If the number of argument is less than 5, throw the CheckArgumentexception,else print the addition of all the five numbers.
11. Consider a Student examination database system that prints the mark sheet of students. Input the following from the command line.
(a) Student’s Name
(b) Marks in six subjects
These marks should be between 0 to 50. If the marks are not in the specified range, raise a RangeException, else find the total marks and prints the percentage of the students.
11. Write a java program to create an custom Exception that would handle at least 2 kind of Arithmetic Exceptions while calculating a given equation (e.g. X+Y*(P/Q)Z-I)
12. Create two user-defined exceptions named “TooHot” and “TooCold” to check the temperature (in Celsius) given by the user passed through the command line is too hot or too cold.
- If temperature > 35, throw exception “TooHot”.
- If temperature <5, throw exception “TooCold”.
- Otherwise, print “Normal” and convert it to Farenheit.
13. Consider an Employee recruitment system that prints the candidate name based on the age criteria. The name and age of the candidate are taken as Input.Create two user-defined exceptions named “TooOlder” and “TooYounger”
- If age>45, throw exception “TooOlder”.
- If age<20, throw exception “TooYounger”.
- Otherwise, print “Eligible” and print the name of the candidate.
14. Consider a “Binary to Decimal” Number conversion system which only accepts binary number as Input. If user provides a decimal number a custom Exception “WrongNumberFormat” exception will be thrown. Otherwise, it will convert into decimal and print into the screen.
15. Write a Java Program that Implement the Nested Try Statements.
16. Write a Java Program to Create Account with 500 Rs Minimum Balance, Deposit Amount, Withdraw Amount and Also Throws LessBalanceException.
- Java Program Which has a Class Called LessBalanceException Which returns the Statement that Says WithDraw Amount(_Rs) is Not Valid
- Java Program that has a Class Which Creates 2 Accounts, Both Account Deposit Money and One Account Tries to WithDraw more Money Which Generates a LessBalanceException Take Appropriate Action for the Same.
17. Consider a Library Management System, where a user wants to find a book. If the book is present in Library (Hint: Use predefined array), then it will print the book. Otherwise it will throw an exception “BookNotFoundException”.
18. Consider a Quiz Management System, where a user needs to answer 5 questions. If any of the answer is wrong, throw an exception “NotCorrectException”. If the answer is correct give a message “good! The answer is correct”.
19. Write a program to raise a user defined exception if username is less than 6 characters and password does not match.
20. Write a program to accept a password from the user and throw 'Authentication Failure' exception if the password is incorrect.
21. Write a program to input name and age of a person and throw a user-defined exception, if the entered age is negative.
22. Write a program to throw user defined exception if the given number is not positive.
23. Write a program to throw a user-defined exception "String Mismatch Exception", if two strings are not equal (ignore the case).
24. Design a stack class. Provide your own stack exceptions namely push exception and pop exception, which throw exceptions when the stack is full and when the stack is
empty respectively. Show the usage of these exceptions in handling a stack object in the main.
25. Write an application that displays a series of at least five student ID numbers (that
you have stored in an array) and asks the user to enter a numeric test score for the
student. Create a ScoreException class, and throw a ScoreException for the class if
the user does not enter a valid score (zero to 100). Catch the ScoreException and then display an appropriate message. In addition, store a 0 for the student’s score. At the end of the application, display all the student IDs and scores.

******************************************************
## Code Contributed by, Abhishek Sharma, 2021 @abhisheks008


