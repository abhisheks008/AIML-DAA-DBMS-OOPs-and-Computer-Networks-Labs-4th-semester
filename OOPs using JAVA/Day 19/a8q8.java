/*
8. Write a program that takes a value at the command line for which factorial is to be computed. The program must convert the string to its integer equivalent. There are three possible user input errors that can prevent the program from executing normally. 
• The first error is when the user provides no argument while executing the program and an ArrayIndexOutOfBoundsException is raised. You must write a catch block for this. 
• The second error is NumberFormatException that is raised in case the user provides a non-integer (float double) value at the command line. 
• The third error is IllegalArgumentException. This needs to be thrown manually if the value at the command line is 0. 
*/
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
public class q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=0;
        try{
            n=Integer.parseInt(str);
            if(n==0)
                throw new IllegalArgumentException();
            int z=n;
            int fact=1;
            while(n>1){
                fact*=n;
                n--;
            }
            System.out.println("Factorial of "+z+" = "+fact);
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print(e);
        }
        catch(NumberFormatException e){
            System.out.print(e);
        }
        catch(IllegalArgumentException e){
            System.out.print(e);
        }
    }
}

/*
Output :
1.00
java.lang.NumberFormatException: For input string: "1.00"

0
java.lang.IllegalArgumentException

5
Factorial of 5 = 120
*/
