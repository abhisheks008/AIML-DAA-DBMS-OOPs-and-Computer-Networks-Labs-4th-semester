// 7. Write a program that outputs the name of the capital of the country entered at the command line. The program should throw a “NoMatchFoundException” when it fails to print the capital of the country entered at the command line. 
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class NoMatchFoundException extends Exception{
    NoMatchFoundException(String s){
        super(s);
    }
}
public class q7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the capital name");
        String str=sc.next();
        String cap="delhi";
        try {
        if(str.equals(cap)){
            System.out.println("Match");
        }
        else{
            throw new NoMatchFoundException("NoMatchFoundException");
        }
    } 
    catch (Exception e) {
        System.out.println(e);
    }
    System.out.print("Rest Code");
    }
}

/*
Output :
Enter the capital name
Kolkata
NoMatchFoundException: NoMatchFoundException
Rest Code
*/
