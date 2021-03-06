// Write a class, Grader, which has an instance variable, score, an appropriate constructor and appropriate methods. A method, letterGrade() that returns the letter grade as O/E/A/B/C/F. 
 
// Now write a demo class to test the Grader class by reading a score from the user, using it to create a Grader object after validating that the value is not negative and is not greater than 100. Finally, call the letterGrade() method to get and print the grade. 

import java.util.Scanner;
// Author : Abhishek Sharma
class Grader {
    public int s;
    public int marks;
    public int m;
    public static void letterGrade(int s){
        if (s>90 && s<=100)
            System.out.println("You Have Obtained : Grade O");
        else if(s>80 && s<=90)
            System.out.println("You Have Obtained : Grade E");
        else if (s>70 && s<=80)
            System.out.println("You Have Obtained : Grade A");
        else if (s>60 && s<= 70)
            System.out.println("You Have Obtained : Grade B");
        else if (s>50 && s<= 60)
            System.out.println("You Have Obtained : Grade C");
        else
            System.out.println("You Have Obtained : Grade F");
    }

    public static void demo(int marks){
        if (marks>=0 && marks<=100){
            int m = marks;
            letterGrade(m);
        }
        else {
            System.out.println("Invalid Input Given! Pls Check");
        }
    }
  
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks obtained : ");
        score = sc.nextInt();
        
        demo(score);
    }
  }

/*
Output :
Enter the marks obtained : 85
You Have Obtained : Grade E

Enter the marks obtained : 102
Invalid Input Given! Pls Check

Enter the marks obtained : -85
Invalid Input Given! Pls Check
*/
