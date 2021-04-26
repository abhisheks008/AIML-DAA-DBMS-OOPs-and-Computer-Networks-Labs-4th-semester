// 14. Consider a “Binary to Decimal” Number conversion system which only accepts binary number as Input. If user provides a decimal number a custom Exception “WrongNumberFormat” exception will be thrown. Otherwise, it will convert into decimal and print into the screen. 
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class WorngNumberException extends Exception{
    WorngNumberException(){
        super("Please enter the binary number");
    }
}
public class q14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number (in binary):");
        String str=sc.next();
        try{
            for(int i=0;i<str.length();i++)
                if(str.charAt(i)!='0' && str.charAt(i)!='1')
                    throw new WorngNumberException();
            int a=Integer.parseInt(str,2);
            System.out.print("Decimal :"+a);
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}

/*
Output :
Enter the number (in binary):
111
Decimal :7

Enter the number (in binary):
123
WorngNumberException: Please enter the binary number
*/
