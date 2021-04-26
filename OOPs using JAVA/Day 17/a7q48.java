// Q48. Write a Java Program to Ask the User His Name and Greets Him With His Name. 
import java.util.*;
//Author : Abhishek Sharma
public class q48 {  
    public static void main(String[] args) {
        Scanner stdin = new Scanner( System.in );
        String usersName;      
        String upperCaseName;  
        System.out.print("Please enter your name: ");
        usersName = stdin.nextLine();
        upperCaseName = usersName.toUpperCase();
        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");
    }  
} 
 
/*
Output :
Please enter your name: abhishek
Hello, ABHISHEK, nice to meet you!
*/
