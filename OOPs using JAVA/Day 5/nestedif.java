// Object Oriented Programming using JAVA
// Date : 17.02.2021
// Author : Abhishek Sharma
// Day 5 Assignments and classworks


// Program 1 : JAVA program for nested if statement 
public class nestedif{
	public static void main(String [] args){
	int age = 25;
	int weight = 48;

	if (age>=18){
		if (weight>50){
			System.out.println("You are eligible to donate blood!");
		} 
		else{
			System.out.println("You are not eligible to donate blood");
		}
	} 
	else{
		System.out.println ("You must be above 18 years");
	}
	}
}


// Output :
// You are not eligible to donate blood.
