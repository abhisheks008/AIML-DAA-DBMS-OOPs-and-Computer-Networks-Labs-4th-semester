// OOPs using Java Programming Language
// UEMK 4th Semester
// Author : Abhishek Sharma

// In Today's Lecture topics covered :
// a. Logical And and Or Operator
// b. Bitwise And and Or operator
// c. 'and' short circuiting operator
// d. Ternary Operator in Java
// e. Java Assignment Operator '='
// f. Java Operators Precedence
// g. Dot '.' operator
// h. If/Else Statement
// i. instanceof operator

// a. Logical and, or and Bitwise and, or operator in Java :
public class Main {
	public static void main(String[] args){
		int a=10;
		int b = 5;
		int c = 20;
		System.out.println(a<b && a<c); //  logical and operator
		System.out.println(a<b & a<c); // bitwise and operator
		System.out.println(a>b||a<c); // logical or operator
		System.out.println(a>b | a<c); // bitwise or operator
	}
}
// Output :
// false
// false
// true
// true


// b. and short circuiting operator :
public class Main {
	public static void main(String[] args){
    if (false && true && false){
			System.out.println("This Output will not be printed!");
		}
		else {
			System.out.println("This Output will be Printed!");
		}
  }
}
// Output : true


// c. Ternary operator in Java
public class Main {
	public static void main(String[] args){
    int a = 10;
    int b = 5;
    int min = (a>b)?a:b; // Ternary Operator in Java
		// Syntax : (condition) ? variable : variable
		// (a>b) ? a : b
		// if a>b is True then print 'a' else print 'b'
    System.out.println(min);
	}
}
// Output : 10


// d. Java Assignment Operator 
public class Main {
	public static void main(String[] args){
    int a = 10;
    int a1 = a+=4; // Java Assignment Operator
    System.out.println(a1);
	}
}
// Output : 14


// e. Java Operators Precedence :
public class Main {
	public static void main(String[] args){
    int a = 20, b=10, c=0, d=20, e=40, f=30;
		System.out.println("a+b/d = " + (a+b/d));
		System.out.println("a+b*d-e/f = "+ (a+b*d-e/f));
	}
}
// Output : 20, 219


// f. Dot Operator in Java
public class Main {
  void display(){
		  double d = 20.3;
		  int i = (int)d;
		  System.out.println(i);
	 }
	public static void main(String[] args){
      Main s = new Main();
		  s.display(); // dot operator
	}
}
// Output : 20


// g. If/Else Statement
public class Main {
	public static void main(String[] args){
    int number = 13;
		if (number%2 == 0){
			System.out.println("Even Number!");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}
// Output : Odd Number


// h. instanceof Operator
public class Main {
  void display(){
		  double d = 20.3;
		  int i = (int)d;
		  System.out.println(i);
	 }
	public static void main(String[] args){
    Main s = new Main();
    s.display(); // dot operator
		System.out.println(s instanceof Main); // instanceof operator
	}
}
// Output : true
