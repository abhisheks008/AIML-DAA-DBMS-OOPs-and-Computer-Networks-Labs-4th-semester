// 22. Write a program to throw user defined exception if the given number is not positive. 
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class NotPositiveException extends Exception{
    NotPositiveException(){
        super("Age should'nt be negetive");
    }
}
public class q22{
    public static void main(String arrg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int age=sc.nextInt();
        if(age<0)
            try {
                throw new NotPositiveException();
            } 
            catch (NotPositiveException e) {
                System.out.print(e);
            }
    }
}

/*
Output :
Enter a number :
-65
*/
